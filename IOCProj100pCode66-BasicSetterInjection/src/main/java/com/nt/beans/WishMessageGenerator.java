package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
    private Calendar calendar; 
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	public  String generateWishMsg(String uname) {
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "GM:"+uname;
		else if(hour<16)
			return "GA:"+uname;
		else if(hour<20)
			return "GE:"+uname;
		else 
			return "GN:"+uname;
	}

}
