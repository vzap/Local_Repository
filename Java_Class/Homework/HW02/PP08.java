/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.8
*/

import java.util.*;
import java.math.*;

public class PP08{
	public static void main(String[] args){

		Scanner consoleInput = new Scanner(System.in);

		//declare variables
		int hours, minutes, seconds, tSeconds;

		//set constants
		final int MULTIPLE = 60;

		//ask the user for suff and things
		System.out.println("Enter the number of hours: (Must be a whole number)");
		hours = Math.abs(consoleInput.nextInt());
		System.out.println("Enter the number of minutes: (Must be a whole number)");
		minutes = Math.abs(consoleInput.nextInt());
		System.out.println("Enter the number of seconds: (Must be a whole number)");
		seconds = Math.abs(consoleInput.nextInt());

		//calculation
		tSeconds = seconds +((minutes +hours * MULTIPLE) * MULTIPLE);

		//display
		System.out.println("This is the total number of seconds " + tSeconds);
	}
}