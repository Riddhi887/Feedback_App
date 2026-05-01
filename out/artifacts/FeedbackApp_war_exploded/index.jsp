<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="components/links.jsp"%>
</head>
<body>
<%@include file="components/header.jsp"%>

<!-- Full-height container minus navbar, centers the button vertically -->
<div class="content_container d-flex justify-content-center align-items-center">
    <a href="<%= application.getContextPath()%>/feedback.jsp" class="feedback_btn">Give us Feedback</a>
</div>

<%@include file="components/scripts.jsp"%>
</body>
</html>