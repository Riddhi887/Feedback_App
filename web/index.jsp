<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback App</title>
    <%@include file="components/links.jsp"%>
</head>
<body>
<%@include file="components/header.jsp"%>

<!-- Full-height container minus navbar, centers the button vertically -->
<div class="content_container d-flex justify-content-center align-items-center gap-3">
    <a href="<%= application.getContextPath()%>/feedback.jsp" class="feedback_btn">Give us Feedback</a>
    <a href="<%= application.getContextPath()%>/servlet1" class="feedback_btn">Go to Servlet 1</a>
    <a href="<%= application.getContextPath()%>/servlet2" class="feedback_btn">Go to Servlet 2</a>
</div>

<%@include file="components/scripts.jsp"%>
</body>
</html>