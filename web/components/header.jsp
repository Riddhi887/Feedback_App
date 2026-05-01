<%-- Determine the current page name from the request URI for active tab highlighting --%>
<%
    String currentPage = request.getRequestURI();
    currentPage = currentPage.substring(currentPage.lastIndexOf("/") + 1);
%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Feedback App</a>
        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarScroll"
                aria-controls="navbarScroll"
                aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
                style="--bs-scroll-height: 100px;">

                <%-- FIXED: active class is set server-side by comparing currentPage to each tab's page --%>
                <li class="nav-item">
                    <a class="nav-link <%= "index.jsp".equals(currentPage) ? "active" : "" %>"
                       aria-current="<%= "index.jsp".equals(currentPage) ? "page" : "" %>"
                       href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= "about.jsp".equals(currentPage) ? "active" : "" %>"
                       href="about.jsp">About</a>
                </li>
                <li class="nav-item">
                    <%-- Services is disabled; no href needed --%>
                    <a class="nav-link disabled" aria-disabled="true">Services</a>
                </li>
            </ul>

            <form class="d-flex" role="search">
                <input class="form-control me-2 bg-dark text-white"
                       type="search"
                       placeholder="Search"
                       aria-label="Search"/>
                <button class="btn-search btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>