/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.3
*/

import java.util.*;

public class PP03{
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);

		//declare vars
		float numb1, numb2;

		//get input
		System.out.println("Please type in a number: ");
		numb1 = consoleInput.nextFloat();
		System.out.println("Please type in another number: ");
		numb2 = consoleInput.nextFloat();

		//display the sum, diference and product of the 2 floating numbers
		System.out.println("Sum = " + (numb1 + numb2) +
						   "\nDifference = "  + (numb1 - numb2) +
						   "\nProduct = " + (numb1 * numb2));
	}
}