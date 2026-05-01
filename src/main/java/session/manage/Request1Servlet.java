package session.manage;
//managing session using cookies
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //create a cookie
        String username = "riddhi";
        String userId = "8887";
        Cookie cookie = new Cookie("username", username); //create cookie
        cookie.setMaxAge(10*60); //set cookie expiration time
        resp.addCookie(cookie);
    }
}
