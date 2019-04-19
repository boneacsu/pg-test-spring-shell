package com.boneacsu.research.spring.shell;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service("loremIpsumService")
@Log4j2
public class ServiceThatWritesLoremIpsum implements ServiceInterface {
    private static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n" +
            "Quisque sed efficitur quam. Aenean eget purus vitae lectus euismod gravida. \n" +
            "Vivamus pretium semper metus. Integer interdum ipsum et orci dignissim rhoncus. \n" +
            "Vestibulum ac pellentesque est. Pellentesque interdum erat \n" +
            "at urna interdum, et scelerisque orci lobortis. \n" +
            "Donec nec elit quis lorem finibus scelerisque a sed nibh. \n" +
            "Duis mattis, sem at placerat accumsan, felis odio dictum orci, \n" +
            "eu tincidunt purus ex in enim. Cras interdum vel leo elementum maximus. \n" +
            "Aliquam erat volutpat.";

    public void writeLoremText() {
        log.info(text);
    }

    @Override
    public void executeCommand(String command) {
        log.info("Ignoring command param. I know to do just one thing :)");
        writeLoremText();
    }
}
