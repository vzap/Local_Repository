/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.4
*/

import java.util.*;

public class PP04{
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);
		//declare variables
		String name;
		String college;
		String pet;
		//this should be an int due to age but since its just getting printed out I will make it a string
		String age;

		//get user information
		System.out.println("Type your name and press enter: ");
		name = consoleInput.nextLine();
		//would use input.nextInt but since its not important if they enter a number its fine.
		System.out.println("Type your age and press enter: (must be a number)");
		age = consoleInput.nextLine();
		System.out.println("Type the name of the college you go to and press enter: ");
		college = consoleInput.nextLine();
		System.out.println("Type your dogs name and press enter: ");
		pet = consoleInput.nextLine();

		//diplay the user information
		System.out.println("Name: " + name + "\nage: " + age +
						 "\nCollege: " + college + "\nPet: " + pet);
	}
}