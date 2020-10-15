package br.com.darkstar;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class Project1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException {
        String param1 = req.getParameter("name");
        resp.setHeader("Content-Type", "text/html");
        resp.getWriter().write("Fuck you " + param1 + "\n");
    }


}
