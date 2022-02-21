package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*

The whole purpose of PropertyInjectedController and PropertyInjectedControllerTest is to demonstrate what
Spring IoC does behind the scenes for "Property based injection"

 */
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;

    public PropertyInjectedController() {
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
