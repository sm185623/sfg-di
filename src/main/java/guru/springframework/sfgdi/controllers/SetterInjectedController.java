package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*

The whole purpose of SetterInjectedController and SetterInjectedControllerTest is to demonstrate what
Spring IoC does behind the scenes for "Setter based injection"

 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public SetterInjectedController() {
    }

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
