package io.github.jirkasa.servletroutertest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {
	AppRouter appRouter = new AppRouter();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			appRouter.handle(req, res);
		} catch (Exception e) {
			System.out.println(e);
			res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Something went wrong.");
		}
	}
}