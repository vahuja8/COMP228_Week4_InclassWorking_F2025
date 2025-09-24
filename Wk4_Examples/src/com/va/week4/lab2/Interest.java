package com.va.week4.lab2;

public class Interest {
	
	private double principal;

	private double rate;
	private int time;
	
	
	public Interest() {
		
		/*
		 * Add the logic of validation.. for validating principal, rate and time..
		 *   // validate hour, minute and second
     REFER---  if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60))
     
     Validation--- dont permit negative values..
     			   dont permit integer values for principal , and rate.
     			   dont permit String 
      	 * 
		 */
		
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}

	// methods for calculating SI  = PRT/100; 
	
	double SimpleInterest(double principal, double rate, int time)
	{
		
		double something = 0;
		return something ;
	}
	
	// method for calculating COMP Int
	
	
}
