//managing session using cookies and http session
package session.manage;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.awt.*;
import java.io.IOException;

//@WebServlet("/servlet2") //before adding to .xml
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

        //fetching parameters from .xml
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext= servletConfig.getServletContext();
        //get context and config data
        String appName =servletContext.getInitParameter("app_name");
        String userEmail= servletConfig.getInitParameter("userEmail");
        resp.getWriter().println(
                """
                <h1>Servlet Context Param : %s</h1>
                <h1>Init Params: %s</h1>
                """.formatted(appName, userEmail)
        );


        //http session
        //fetch the userKey from the Http session
        HttpSession session = req.getSession();
        String userKey =(String)session.getAttribute("userKey"); // typecast to string cz session returns an obj
        writer.println("<h1> Session Key: %s".formatted(userKey));

        if(!flag){
            writer.println("<h1> No username found in the cookie</h1>");
            writer.println("<h1>No Cookie Found</h1>");
        }


    }
}
