package io.github.jirkasa.servletroutertest.httpcontroller;

import io.github.jirkasa.servletrouter.HttpController;
import io.github.jirkasa.servletrouter.HttpRouter;

public class SkipUnimplementedMethodsRouter extends HttpRouter {
	public SkipUnimplementedMethodsRouter() {
		register("/empty-controller", SkipUnimplementedMethodsEmptyController.class);
		register(SkipUnimplementedMethods404Controller.class);
	}
}