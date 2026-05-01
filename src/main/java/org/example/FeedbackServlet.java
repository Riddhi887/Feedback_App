package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //get the form data
         String email = req.getParameter("email");
         String phone = req.getParameter("phone");
         String feedback_message = req.getParameter("feedback_message");

         //process the form data

        //response back through servlet
        resp.setContentType("text/html");
        PrintWriter writer= resp.getWriter();
        writer.println("<h1>Feedback Servlet Working</h1>");

        //print email ph.no and feedback message
        writer.printf(
                "<h2>Your form details that you have submitted:</h2>" +
                        "<h3>Email: %s</h3>" +
                        "<h3>Phone Number: %s</h3>" +
                        "<h3>Feedback Submitted: %s</h3>%n",
                email, phone, feedback_message
        );

    }
}
