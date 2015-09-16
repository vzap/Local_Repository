/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.10
*/

import java.util.*;
import java.math.*;

public class PP10{
	public static void main(String[] args){

		Scanner consoleInput = new Scanner(System.in);

		//declare variables
		int total, dollars, quarters, dimes, nickels, pennies, remainder;

		//constant
		final int FDOLLAR = 100;
		final int FQUARTER = 25;
		final int FDIME = 10;
		final int FNICKEL = 5;

		//get input
		System.out.println("Type how much money was in the jar: (must be a whole number)");
		total = Math.abs(consoleInput.nextInt());

		//process and display
		if( total == 0) System.out.println("There was no money in the jar!");
		else {
			dollars = total / FDOLLAR;
			remainder = total % FDOLLAR;

			quarters = remainder / FQUARTER;
			remainder = remainder % FQUARTER;

			dimes = remainder / FDIME;
			remainder = remainder % FDIME;

			nickels = remainder / FNICKEL;

			pennies = remainder % FNICKEL;

			System.out.println("The cash break down: \n" +
							   "Dollars:	" + dollars + "\n" +
							   "Quarters:	" + quarters + "\n" +
							   "Dimes:		" + dimes	+ "\n" +
							   "Nickels:	" + nickels + "\n" +
							   "Pennies:	" + pennies + "\n");
		}
	}
}