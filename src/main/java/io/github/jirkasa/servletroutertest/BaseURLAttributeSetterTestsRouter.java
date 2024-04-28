package io.github.jirkasa.servletroutertest;

import io.github.jirkasa.servletrouter.BaseURLAttributeSetter;
import io.github.jirkasa.servletrouter.HttpRouter;
import io.github.jirkasa.servletroutertest.baseurlattributesetter.DisplayBaseURLAttributeWithCustomNameController;
import io.github.jirkasa.servletroutertest.baseurlattributesetter.DisplayBaseURLController;

public class BaseURLAttributeSetterTestsRouter extends HttpRouter {
	public BaseURLAttributeSetterTestsRouter() {
		register("/set-attribute", new BaseURLAttributeSetter(), DisplayBaseURLController.class);
		register("/set-attribute-with-custom-name", new BaseURLAttributeSetter("CUSTOM_NAME_FOR_BASE_URL"), DisplayBaseURLAttributeWithCustomNameController.class);
	}
}