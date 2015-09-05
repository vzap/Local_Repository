/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.6
*/

import java.util.*;

public class PP06{
	public static void main(String[] args){

		Scanner consoleInput = new Scanner(System.in);
		//declare variables
		float miles;
		float km;

		//constants
		float divide = 0.62137f;

		//promt the user for the number of miles via the console
		System.out.println("Type the number of miles: (must be a number)");
		miles = consoleInput.nextFloat();

		//covert miles to km
		km = miles/divide;

		//display
		System.out.println("You went " + km + " kilometers");
	}
}