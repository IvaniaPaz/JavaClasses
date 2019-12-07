package com.class06;

public class Recap {

	public static void main(String[] args) {
		
		/*Declare the time(1-24)
		 * Based on the time identify whether it's morning, afternoon, evening
		 * if 1-11--> morning
		 * if 12-15--> noon
		 * if 16-20---> evening
		 * if >20 --. night
		 */

		int time=33;
		String timeofDay=null;
		
		if(time>1 && time<=11) {
			timeofDay="Morning";
		}else if(time>=12 && time <=15) {
		timeofDay="Noon";
		}else if (time>=16 && time<=20) {
			timeofDay="Evening";
		}else if(time>20 && time <=24) {
			timeofDay="Night";
		}else {
		timeofDay="Invalid";
		}
		System.out.println("Time of the day is "+timeofDay);
		
		
		
		
	}

}
