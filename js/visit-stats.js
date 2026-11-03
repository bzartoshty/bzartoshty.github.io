(() => {
  "use strict";
  const stats = document.querySelector("[data-visit-stats]");
  if (!stats) return;
  const currentPage = stats.dataset.currentPage;
  const isLive = location.hostname === "bzartoshty.github.io";
  const base = "https://countapi.mileshilliard.com/api/v1";
  const pages = ["home", "comp110", "comp182", "comp282"];
  const formatter = new Intl.NumberFormat();
  // Stable keys combine / and /index.html, and course directory aliases.
  // Read the other counters without incrementing them. Do not retry hits:
  // a timed-out request may already have been counted by the server.
  pages.forEach(async (page) => {
    const output = stats.querySelector('[data-visit-count="' + page + '"]');
    if (!output) return;
    const action = isLive && page === currentPage ? "hit" : "get";
    const key = "bzartoshty-github-io-" + page + "-20261102";
    const controller = new AbortController();
    const timeout = setTimeout(() => controller.abort(), 10000);
    try {
      const response = await fetch(base + "/" + action + "/" + key, {
        signal: controller.signal,
        cache: "no-store",
        credentials: "omit",
        referrerPolicy: "no-referrer"
      });
      if (action === "get" && response.status === 404) {
        const missing = await response.json();
        if (missing.error !== "Key not found") throw new Error("Counter unavailable");
        output.textContent = "0";
      } else {
        if (!response.ok) throw new Error("Counter unavailable");
        const data = await response.json();
        if (!Number.isSafeInteger(data.value) || data.value < 0) throw new Error("Invalid count");
        output.textContent = formatter.format(data.value);
      }
    } catch (_) {
      output.textContent = "Unavailable";
    } finally {
      clearTimeout(timeout);
    }
  });
})();
