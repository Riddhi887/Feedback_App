console.log("file loaded")
// Wait until DOM is ready
document.addEventListener("DOMContentLoaded", function () {
    // Get just the filename portion of the current URL (e.g. "about.jsp")
    const currentPage = window.location.pathname.split("/").pop() || "index.jsp";

    const navLinks = document.querySelectorAll(".navbar-nav .nav-link");

    navLinks.forEach(link => {
        // Extract the filename from each link's href
        const linkPage = link.getAttribute("href");

        if (linkPage && currentPage === linkPage) {
            // Mark this tab active if it matches the current page
            link.classList.add("active");
            link.setAttribute("aria-current", "page");
        } else {
            // Remove active from all other tabs (clears any stale server-side markup)
            link.classList.remove("active");
            link.removeAttribute("aria-current");
        }
    });
});