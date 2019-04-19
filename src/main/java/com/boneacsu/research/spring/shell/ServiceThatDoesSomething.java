package com.boneacsu.research.spring.shell;

import com.google.common.base.Strings;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service("justDoSomethingService")
@Log4j2
public class ServiceThatDoesSomething implements ServiceInterface {
    public void doSomething() {
        log.info("Doing some awesome work.");
    }

    public void doSomethingElse() {
        log.info("Simply doing something else.");
    }

    @Override
    public void executeCommand(String command) {
        if(!Strings.isNullOrEmpty(command)){
            doSomething();
        }
        else {
            doSomethingElse();
        }
    }
}
