package com.yubi.fullstack.webstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableScheduling
public class WebstatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebstatusApplication.class, args);
	}

}
