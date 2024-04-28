package io.github.jirkasa.servletroutertest.httpmiddleware;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpController;

public class HandleRequestController extends HttpController {
	@Override
	protected void handleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Request handled by controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Request handled by controller</h1>");
            out.println("</body>");
            out.println("</html>");
        }
	}
}