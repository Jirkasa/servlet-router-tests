package io.github.jirkasa.servletroutertest.httpcontroller;

import io.github.jirkasa.servletrouter.HttpRouter;

public class PathParamRouter extends HttpRouter {
	public PathParamRouter() {
		register("/controller", PathParameterController.class);
	}
}