package io.github.jirkasa.servletroutertest.httpmiddleware;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpMiddleware;

public class HandleRequestMiddleware extends HttpMiddleware {
	@Override
	public boolean handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Request has been handled by middleware</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Request has been handled by middleware</h1>");
            out.println("</body>");
            out.println("</html>");
        }
		return false;
	}
}