(() => {
  const year = document.getElementById("year");
  if (year) year.textContent = new Date().getFullYear();
  const toggle = document.querySelector(".theme-toggle");
  if (!toggle) return;
  let storedTheme;
  try { storedTheme = localStorage.getItem("homepage-theme"); } catch (_) {}
  const preference = window.matchMedia("(prefers-color-scheme: dark)");
  function setTheme(dark) {
    document.body.classList.toggle("dark", dark);
    toggle.setAttribute("aria-pressed", String(dark));
    toggle.textContent = dark ? "Light mode" : "Dark mode";
  }
  setTheme(storedTheme === "dark" || (!storedTheme && preference.matches));
  toggle.hidden = false;
  toggle.addEventListener("click", () => {
    const dark = !document.body.classList.contains("dark");
    storedTheme = dark ? "dark" : "light";
    setTheme(dark);
    try { localStorage.setItem("homepage-theme", storedTheme); } catch (_) {}
  });
  preference.addEventListener("change", event => {
    if (!storedTheme) setTheme(event.matches);
  });
})();
