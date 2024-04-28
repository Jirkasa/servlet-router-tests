package io.github.jirkasa.servletroutertest;

import io.github.jirkasa.servletrouter.HttpRouter;

public class AppRouter extends HttpRouter {
	public AppRouter() {
		register("http-router", new HttpRouterTestsRouter());
		register("http-controller", new HttpControllerTestsRouter());
		register("http-middleware", new HttpMiddlewareTestsRouter());
		register("base-url-attribute-setter", new BaseURLAttributeSetterTestsRouter());
	}
}