/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a Java program to convert a decimal number to octal number.

    Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.
    Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 * INPUT: a user input decimal number x
 * OUTPUT: an octal number y converted from x

* Hint: For a decimal number x=1256, the corresponding octal number is y=2350.
 */

import java.util.Scanner;

public class Q2_Decimal2Octal {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);//Defines new scanner from scanner module
        int count = 0;
        int x =-1;
        String octalRev ="";
        while (x<0) {
            System.out.print("Input your decimal number: "); //Asks user for input
            x = scanner.nextInt();
        }
        while (x>=1){
            int remainder = x%8;
           x=x/8;

           octalRev=(String.valueOf(remainder)+octalRev);
        }

        System.out.println("The corresponding octal number is: "+octalRev);
        //Get the integer quotient for the next iteration.
        //Get the remainder for the octal digit.
        //Repeat the steps until the quotient is equal to 0.



    }
}
