/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 2 (20 marks)
 * 
 * Write a Java program to print the sum of two user input integer numbers.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: two user input integer numbers
 * OUTPUT: the sum of the two user input integer numbers
 * 
 * Hint1: you may use java.util.Scanner to take user input numbers.
 * 
 */

import java.util.Scanner;


public class Q2_SumTwoNumbers {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in); //Defines a new scanner from the scanner module
		System.out.print("Input your first integer: "); //Asks user for the first integer to be added
		int x = scanner.nextInt(); // Stores the user's input in value x
		System.out.print("Input your next integer: ");//Asks user for the second integer to be added
		int y =scanner.nextInt();// Stores the user's input in value y
		System.out.println("The sum of the two numbers is: "+(x+y)); //Prints the addition of the two numbers
	}
}
