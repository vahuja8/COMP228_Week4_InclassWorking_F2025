package com.va.week4;

public class TimeTest {
	
	 public static void main(String[] args)
	   {
	      // create and initialize a Time1 object
	      Time time = new Time(); // invokes Time1 constructor
	      
	      // output string representations of the time
	      displayTime("After time object is created", time);
	      System.out.println(); 
	      
	      // attempt to set time with invalid values
	      //1- put the calling code in a try block
	      try
	      {
	         time.setTime(99, 99, 99); // all values out of range
	      } 
	      //2- handle any possible exception in a catch block
	      catch (IllegalArgumentException e)
	      {
	    	  //display error information using getMessage method
	         System.out.printf("Exception: %s%n%n", e.getMessage());
	      } 

	      // display time after attempt to set invalid values
	      displayTime("After calling setTime with invalid values", time); 


	   }

	 private static void displayTime(String header, Time t) {

	      System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
	         header, t.toUniversalString(), t.toString());

		
	 }
}
