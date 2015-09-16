/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.2
*/

import java.util.*;

public class PP02{
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);

		//declare vars
		int numb1, numb2, numb3;

		//get input
		System.out.println("Please type a whole number: ");
		numb1 = consoleInput.nextInt();
		System.out.println("Please type a whole number: ");
		numb2 = consoleInput.nextInt();
		System.out.println("Please type a whole number: ");
		numb3 = consoleInput.nextInt();

		//get the average and display it
		int avr = (numb1 + numb2 + numb3)/3;
		System.out.println("The avrage = " + avr);
	}
}