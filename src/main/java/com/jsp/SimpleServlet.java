package com.jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("Hello World! Maven Web Project Example.\n");
        resp.getWriter().write("Another line of information...\n");
        resp.getWriter().write("I am just writing one more line to be able to debug this peace of shit");
    }
}