function toggleDarkMode() {
    document.body.classList.toggle("dark");
}

document.getElementById("year").textContent =
    new Date().getFullYear();
