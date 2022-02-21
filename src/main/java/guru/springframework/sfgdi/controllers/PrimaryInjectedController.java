package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*

The whole purpose of ConstructorInjectedController and ConstructorInjectedControllerTest is to demonstrate what
Spring IoC does behind the scenes for "Constructor based injection"

 */

@Controller
public class PrimaryInjectedController {
    private final GreetingService greetingService;

    PrimaryInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
