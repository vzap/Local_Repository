/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.5
*/

import java.text.*;
import java.util.*;

public class PP05{
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("#.00");

		//declare var
		double fTemp, cTemp;

		//constants
		final int MINUSNUMB = 32;
		final int MULTIPLYBYNUMB = 5;
		final int DIVIDEBYNUMB = 9;

		//get user enter temp
		System.out.println("What is the Temperature in fahrenheit: (must be a number)");
		fTemp = consoleInput.nextDouble();

		//convert fahrenheit to celsius
		cTemp = ((fTemp - MINUSNUMB)* MULTIPLYBYNUMB)/DIVIDEBYNUMB;

		//display the celsius temp
		System.out.println("The temp is: " + twoDecimal.format(cTemp));
	}
}