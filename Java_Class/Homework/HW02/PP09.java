/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.9
*/

import java.util.*;
import java.math.*;

public class PP09{
	public static void main(String[] args){

		Scanner consoleInput = new Scanner(System.in);

		//declare variables
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int tHours = 0;

		//set constants
		int denominator = 60;

		//ask the user for suff and things
		System.out.println("Enter the number of hours: (Must be a whole number)");
		hours = Math.abs(consoleInput.nextInt());
		System.out.println("Enter the number of minutes: (Must be a whole number)");
		minutes = Math.abs(consoleInput.nextInt());
		System.out.println("Enter the number of seconds: (Must be a whole number)");
		seconds = Math.abs(consoleInput.nextInt());

		//calculation
		tHours = hours +((minutes + seconds / denominator) / denominator);

		//display
		System.out.println("This is the total number of hours " + tHours);
	}
}