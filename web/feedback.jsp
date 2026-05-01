<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback</title>
    <%@include file="components/links.jsp"%>
</head>
<body>
<%@include file="components/header.jsp"%>

<!-- FIXED: added flex-column so heading and form stack vertically -->
<div class="feedbackForm_content d-flex flex-column justify-content-center align-items-center">

    <h4 class="text-white mb-3">Fill the Feedback Form</h4>

    <!-- Form card wrapper for clean look -->
    <form class="feedback_form text-white ">

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input name="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="Eg: abc@gmail.com" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text text-secondary">We'll never share your email with anyone else.</div>
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Phone Number</label>
            <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Eg: 876342109">
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Your Feedback</label>
            <label>
                <textarea rows="10" cols="" placeholder="Enter your feedback message" class="form-control"></textarea>
            </label>
        </div>


        <button type="submit" class="btn btn-primary w-100">Submit</button>

    </form>
</div>

<%@include file="components/scripts.jsp"%>
</body>
</html>