/* Midterm Exam (100 marks in total; 20% of the final grade of this course)
 * 
 * Question 1 (25 marks)
 * 
 * Write a Java program to print the volume of a ball.
 * 
 * INPUT: a positive float-valued radius input by a user. Denoted by r the radius, you can assume 0 < r <= 3.0
 * OUTPUT: the volume of a ball defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint 1: you may use java.util.Scanner to take user input real valued radius.
 * Hint 2: you need to print a message to let the user know when to type the input radius.
 * Hint 3: the volume of a ball is computed by: Volume= (4/3)*PI*r^3, where r is the radius of the ball, and PI=3.14.
 */

import java.util.Scanner;

public class Q1_VolumeOfBall {
	/* place your subroutine code here if there is any */
	public static double calculateVolume(float radius){

		double PI = 3.14;

		double volume = (4.0/3.0)*PI*radius*radius*radius;

		return volume;
	}

	public static void main(String args[])
	{
		/* Place your main code here */
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter radius: ");
		float radius = scanner.nextFloat();

		System.out.printf("The volume of the ball is %.2f",calculateVolume(radius));

	}
}
