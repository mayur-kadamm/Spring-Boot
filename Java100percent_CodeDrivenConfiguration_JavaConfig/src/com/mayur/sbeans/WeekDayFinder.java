package com.mayur.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	
	@Autowired // field injection
	private LocalDate date;
	
	public WeekDayFinder() {
		System.out.println("WDF Constructor.....");
	}
	
	
	// business method
	public String showMsg(String user) {
		// get current week no.
		int number = date.getDayOfWeek().getValue();
		
		// generate the message
		if(number>=1 && number <= 5)
			return "Work Hard ::"+user;
		else
			return "Enjoy your weekend::" +user;
	}

}
