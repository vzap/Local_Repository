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
		String name, college, pet;
		int age;

		//get user information
		System.out.println("Type your name and press enter: ");
		name = consoleInput.nextLine();
		System.out.println("Type your age and press enter: (must be a number)");
		age = consoleInput.nextInt();

		//clear Next line buffer
		consoleInput.nextLine();

		System.out.println("Type the name of the college you go to and press enter: ");
		college = consoleInput.nextLine();
		System.out.println("Type your dogs name and press enter: ");
		pet = consoleInput.nextLine();

		//diplay the user information
		System.out.println("Name: " + name + "\nage: " + age +
						 "\nCollege: " + college + "\nPet: " + pet);
	}
}