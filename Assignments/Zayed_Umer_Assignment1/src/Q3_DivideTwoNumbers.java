/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 3 (20 marks)
 * 
 * Write a Java program to print the result of first user input real number divided by the second user input real number.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 *
 * INPUT: user input real number x, and user input real number y
 * OUTPUT: the result of x divided y. (The result should be printed with two significant digits after the decimal point.)
 * 
 * Hint1: you may use java.util.Scanner to take user input real numbers.
 * Hint2: you may use format string of System.out.printf() when printing the result.
 * 
 */

import java.util.Scanner;

public class Q3_DivideTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Defines new scanner from scanner module

		System.out.print("Input your number to be divided: "); //Asks user for the first double to be divided
		double x = scanner.nextDouble(); //Stores the user's inputted double in the variable x


		System.out.print("Input your number to be divided by: "); //Asks user for the double to be divided by
		double y = scanner.nextDouble(); //Stores the user's inputted double in the variable y

		while (y == 0) { //Keeps asking user until they give a non-zero value
			System.out.print("Cannot divide by 0\nInput your number to be divided by: "); //Asks user for the double to be divided by
			y = scanner.nextDouble(); //Stores the user's inputted double in the variable y
		}
		System.out.printf("The result of this division is: %1.2f \n",(x / y));// Prints the correct value

	}
	}

