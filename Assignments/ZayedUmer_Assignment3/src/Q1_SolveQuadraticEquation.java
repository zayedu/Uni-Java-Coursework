/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    /* place your subroutine code here */

    static String solveQuadratic(double a, double b, double c){
        double root1;
        double root2;
        String roots;
        double discriminant = Math.pow(b,2)-4*a*c;
        if (discriminant<0){
            return "The equation has no real roots";
        }
        else if (discriminant==0){
            root1 = -b/(2*a);
            return "The root is "+String.format("%.2f",root1);
        }
        else {
            root1= (-b+Math.sqrt(discriminant))/(2*a);
            root2= (-b-Math.sqrt(discriminant))/(2*a);

            roots = "The roots are "+String.format("%.2f",root1)+ " and " +String.format("%.2f",root2);
            return roots;

        }
    }
    public static void main(String[] Strings) {
        /* place your code to run your subroutine here */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.println(solveQuadratic(a,b,c));

    }
}
