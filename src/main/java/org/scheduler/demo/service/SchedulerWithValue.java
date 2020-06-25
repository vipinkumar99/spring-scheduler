package org.scheduler.demo.service;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class SchedulerWithValue {

//	@Scheduled
//	public void start() {
//		System.out.println("Scheduler started at:" + LocalDateTime.now());
//	}

//	@Scheduled(fixedDelay = 60000)
//	public void startWithFixedDelay() {
//		System.out.println("Scheduled a task with fixed delay of 60000 milliseconds. it wait 60000 milliseconds after complete of execution:" + LocalDateTime.now());
//	}
//
//	@Scheduled(initialDelay = 30000, fixedDelay = 30000)
//	public void startWithInitialDelayAndFixedDelay() {
//		System.out.println("Scheduled a task with initial delay after start of project 30000 milliseconds and it wait 30000 milliseconds after complete of execution:" + LocalDateTime.now());
//	}
//
//	@Scheduled(fixedRate = 20000)
//	public void startWithFixedRate() {
//		System.out.println("Scheduled a task with fixed rate of 20000 milliseconds and it not wait for complete of previous execution:" + LocalDateTime.now());
//	}
//	
//	@Scheduled(initialDelay = 10000, fixedDelay = 40000)
//	public void startWithInitialDelayAndFixedRate() {
//		System.out.println("Scheduled a task with initial delay after start of project 10000 milliseconds with fixed rate of 40000 milliseconds and it not wait for complete of previous execution:" + LocalDateTime.now());
//	}
//	
}
