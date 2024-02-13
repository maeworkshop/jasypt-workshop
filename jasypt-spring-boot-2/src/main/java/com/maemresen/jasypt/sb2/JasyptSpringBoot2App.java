package com.maemresen.jasypt.sb2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class JasyptSpringBoot2App implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JasyptSpringBoot2App.class, args);
	}

	private final AppProps appProps;

	@Override
	public void run(String... args) throws Exception {
		log.info("I am connecting to DB with user={}, password={}",
				 appProps.getUsername(),
				 appProps.getPassword());
	}
}
