/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
    Write a program in Java to display (i.e. print) the pattern like right angle triangle with a number.

 * INPUT: an integer number n
 * OUTPUT: print a right angle triangle corresponding to n

 * Example1: for n=3, the right angle triangle should be:
    1
    12
    123

 * Example2: for n=5, the right angle triangle should be:
    1
    12
    123
    1234
    12345

 */

import java.util.Scanner;

public class Q5_DisplayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Defines new scanner from scanner module
        int n= -1;

        while ((n<1)|(n>9)) {
            System.out.print("Input your integer: "); //Asks user for input
            n = scanner.nextInt();
        }
        for (int i =1; i<=n; i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();

        }
    }
}
