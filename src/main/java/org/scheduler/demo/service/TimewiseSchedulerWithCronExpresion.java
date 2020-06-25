//package org.scheduler.demo.service;
//
//import java.time.LocalDateTime;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Scheduled;
//
//@Configuration
//public class TimewiseSchedulerWithCronExpresion {
//
//	@Scheduled(cron = "10 * * * * ?")
//	private void startWithEvery10Second1() {
//		System.out.println("Scheduled cron execute  every **:**:10 second:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "*/10 * * * * ?")
//	private void startWithEvery10Second2() {
//		System.out.println("Scheduled cron execute after every 10 second:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 54 * * * ?")
//	private void startWithEvery1Mintue1() {
//		System.out.println("Scheduled cron execute every **:54:00 mintues:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "20 55 * * * ?")
//	private void startWithEvery1Mintue2() {
//		System.out.println("Scheduled cron execute every **:55:20 mintues:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 */2 * * * ?")
//	private void startWithEvery1Mintue() {
//		System.out.println("Scheduled cron execute after every 2 mintues:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 11-25 * * * ?")
//	private void startWithMiniuteRange() {
//		System.out.println("Scheduled cron execute every 11-25 mintues range!" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 10,15,25,30,35,40 * * * ?")
//	private void startWithSpecificedMintue() {
//		System.out.println("Scheduled cron execute at specificed minutes!" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 44 20 * * *")
//	private void startWithSpecificeTime() {
//		System.out.println("Scheduled cron execute at 08:44:00 PM" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 0 13-23 * * *")
//	private void startWithSpecificedClockRange() {
//		System.out.println("Scheduled cron execute at 13,14,15,16,17,18,19,20,21,22,23 clock's:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 0 20,21,22,23 * * *")
//	private void startWithSpecificedClock() {
//		System.out.println("Scheduled cron execute at 20,21,22,23 clock's:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "0 0/28 20-21 * * *")
//	private void startWithSpecificedEveryTime1() {
//		System.out.println("Scheduled cron execute every day at 20:28:00,21:28:00 clock's:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "30 0/29 20-21 * * *")
//	private void startWithSpecificedEveryTime2() {
//		System.out.println("Scheduled cron execute every day at 20:29:30,21:29:30 clock's:" + LocalDateTime.now());
//	}
//
//	@Scheduled(cron = "30 38 21 * * *")
//	private void startWithSpecificedEveryTime3() {
//		System.out.println("Scheduled cron execute every day at 21:38:30 clock's:" + LocalDateTime.now());
//	}
//}
