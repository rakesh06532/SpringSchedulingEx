package com.ex.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyReportService {
	
	@Scheduled(initialDelay =5000, fixedDelay = 1000) //1000 milliseconds=1 second
	public void showReport() {
		System.out.println("Reports: "+new Date());
	}

}
