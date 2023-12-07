/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    /* place your subroutine code here */

    public interface FunctionR2R {
        double valueAt(double var1,double var2);

    }



    public static void main(String[] args){
        /* place your code to run your subroutine here */
        Scanner scanner= new Scanner(System.in);
        FunctionR2R f = (x,y)->{return (Math.sqrt(x*x-y*y));};
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        if (y>x){
            throw new ArithmeticException();
        }

        System.out.printf("f("+x+","+y+") is %.4f" ,f.valueAt(x,y));


    }
}
