package session.manage;
//managing session using cookies and http session
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //get cookie on browser
        resp.setContentType("text/html");
        var writer = resp.getWriter();

        //create a cookie
        String username = "riddhi";
        String userId = "8887";
        Cookie cookie = new Cookie("username", username); //create cookie
        cookie.setMaxAge(10*60); //set cookie expiration time
        resp.addCookie(cookie);

        writer.println("<h1>Username: %s".formatted(username));

        //http session
        HttpSession session = req.getSession();  //we get a session obj
        session.setAttribute("userKey", UUID.randomUUID().toString());
        session.setMaxInactiveInterval(10*60);

    }
}
