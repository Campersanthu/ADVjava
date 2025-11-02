package com.mywebapp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello from Servlet!</h2>");
        out.println("<p>This is a Java Servlet running on Tomcat.</p>");
        out.println("</body></html>");
    }
}
