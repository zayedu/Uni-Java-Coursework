/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;

public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); //Defines new scanner from scanner module
		System.out.print("Input the radius of your circle: "); //Asks user for the radius of their circle
		double r = scanner.nextDouble(); //Stores radius in the double r
		double pi = 3.1415926535897932384626433832795028841971693;// Defines the value of pi

		double area= pi*r*r; // Calculates area

		double perimeter = 2*pi*r; // Calculates perimeter

		System.out.printf("The area of your circles is %1.2f\n",area);
		System.out.printf("The perimeter of your circles is %1.2f\n", perimeter);
		//Above lines print area and perimeter
	}
}
