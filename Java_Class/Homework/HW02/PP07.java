/**
Name:	Vincent P
Course:	COSC 1336
Date:	09/03/2015
asgn:	PP2.7
*/

import java.util.*;
import java.math.*;

public class PP07{
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);

		//declare variables
		int distance, speed;
		float time;

		//prompt user for inputs store inputs
		System.out.println("Type the distance you need to travel then press enter: (Must be a number greater than 0)");
		distance = consoleInput.nextInt();

		System.out.println("Type the speed you will travel then press enter: (Must be a number)");
		speed = consoleInput.nextInt();

		//0 is a valid input
		if (distance == 0) {
			System.out.println("STOP!! you are at your destination");
		} else {
			//calculate the time need to trave
			time = (float)speed/Math.abs(distance);

			//display
			System.out.println("It will take you " + time + " to get to your destination at " + speed + " speed.");
		}
	}
}