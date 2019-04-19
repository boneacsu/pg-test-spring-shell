package com.boneacsu.research.spring.shell;

import org.jline.reader.ParsedLine;
import org.jline.reader.Parser;
import org.jline.reader.SyntaxError;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.shell.jline.JLineShellAutoConfiguration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boneacsu.research.spring.shell"})
@EnableAutoConfiguration(exclude = {JLineShellAutoConfiguration.class})
public class TestSpringShellApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestSpringShellApplication.class, args);
    }

    @Bean
    public Parser parser() {
        return (line, cursor, var3) -> null;
    }
}
