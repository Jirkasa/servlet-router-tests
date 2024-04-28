package io.github.jirkasa.servletroutertest.httpcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpController;

public class ForwardToServletController extends HttpController {
	@Override
	protected void handleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		forwardTo("/http-controller/handle-request", request, response);
	}
}