/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Defines new scanner from scanner module

        System.out.print("Input your integer: "); //Asks user for input
        String n = scanner.next();
        String n2= n+n;
        String n3 = n+n+n;
        int m =Integer.valueOf(n), m2 =Integer.valueOf(n2),m3=Integer.valueOf(n3);
        System.out.println(m+m2+m3);


    }
}
