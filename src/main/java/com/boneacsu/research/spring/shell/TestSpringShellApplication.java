package com.boneacsu.research.spring.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boneacsu.research.spring.shell"})
public class TestSpringShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringShellApplication.class, args);
	}

	@Bean
	public PromptProvider myPromptProvider() {
		return () -> new AttributedString("bootstrap:>",
				AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
	}
}
