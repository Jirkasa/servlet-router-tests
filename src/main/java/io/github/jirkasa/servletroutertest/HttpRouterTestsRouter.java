package io.github.jirkasa.servletroutertest;

import io.github.jirkasa.servletrouter.HttpRouter;
import io.github.jirkasa.servletroutertest.httprouter.SubrouterController;
import io.github.jirkasa.servletroutertest.httprouter.TestController;
import io.github.jirkasa.servletroutertest.httprouter.TestErrorController;
import io.github.jirkasa.servletroutertest.httprouter.TestHandler;
import io.github.jirkasa.servletroutertest.httprouter.ThrowErrorController;

public class HttpRouterTestsRouter extends HttpRouter {
	public HttpRouterTestsRouter() {
		register("/test-handler", new TestHandler("Test handler registered"));
		register("/test-controller", TestController.class);
		register("/error", ThrowErrorController.class);
		
		HttpRouter subRouter = new HttpRouter();
		subRouter.register(SubrouterController.class);
		register("sub-router", subRouter);
		
		registerErrorController(TestErrorController.class);
	}
}