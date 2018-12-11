package com.troy.presen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class PresenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresenApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() {
		System.out.println(
				"Fixed delay task - " + System.currentTimeMillis() / 1000);
	}
}
