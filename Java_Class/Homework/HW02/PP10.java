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
		int total = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		int remainder = 0;

		//constant
		int fDollar = 100;
		int fQuarter = 25;
		int fDime = 10;
		int fNickel = 5;

		//get input
		System.out.println("Type how much money was in the jar: (must be a whole number)");
		total = Math.abs(consoleInput.nextInt());

		//process and display
		if( total == 0) System.out.println("There was no money in the jar!");
		else {
			dollars = total / fDollar;
			remainder = total % fDollar;

			quarters = remainder / fQuarter;
			remainder = remainder % fQuarter;

			dimes = remainder / fDime;
			remainder = remainder % fDime;

			nickels = remainder / fNickel;

			pennies = remainder % fNickel;

			System.out.println("The cash break down: \n" +
							   "Dollars:	" + dollars + "\n" +
							   "Quarters:	" + quarters + "\n" +
							   "Dimes:		" + dimes	+ "\n" +
							   "Nickels:	" + nickels + "\n" +
							   "Pennies:	" + pennies + "\n");
		}
	}
}