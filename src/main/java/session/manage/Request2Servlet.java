//managing session using cookies
package session.manage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet2")
public class Request2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      //get cookie on browser
      resp.setContentType("text/html");
      var writer = resp.getWriter();

      //get cookie 1 as request to generate res 2
        Cookie[] cookies = req.getCookies();
        var flag = false; //cookie present or not
        if(cookies !=null){
            for(Cookie c: cookies){
                //get the name of cookie
                String name = c.getName();
                if(name.equals("username")){
                    System.out.println("username: "+c.getValue()); //get the value if the cookie1 and cookie 2 username matches
                    writer.println("<h1>Welcome back %s </h1>".formatted(c.getValue())); //get the name as response from cookies
                    flag = true;
                }
            }
        }
        if(!flag){
            writer.println("<h1> No username found in the cookie</h1>");
            writer.println("<h1>No Cookie Found</h1>");
        }
    }
}
