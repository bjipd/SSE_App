package com.dind.Sse_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 
public class SseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SseAppApplication.class, args);
	}

}
