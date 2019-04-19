package com.boneacsu.research.spring.shell;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Locale;

@ShellComponent
@Log4j2
public class MyFirstShellComponent {
    @Autowired
    @Qualifier("justDoSomethingService")
    private ServiceInterface serviceThatDoesSomething;

    @Autowired
    @Qualifier("loremIpsumService")
    private ServiceInterface loremIpsumService;

    @ShellMethod("Just do something")
    public String doSomething(
         @ShellOption(defaultValue = "") String command){
        // invoke service
        serviceThatDoesSomething.executeCommand(command);

        return "";
    }

    @ShellMethod("Lorem ipsum rulz")
    public String lorem(
            @ShellOption(defaultValue = "John") String yourName){
        log.info("Welcome {}", yourName);
        loremIpsumService.executeCommand("");

        return "";
    }
}
