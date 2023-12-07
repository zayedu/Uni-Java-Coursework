/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
    Write a Java program to print integer numbers between 1 to a user input integer n, which are divisible by 3, 5 and by both.

 * INPUT: a user input integer n
 * OUTPUT: all the integer numbers between 1 and n that are either divisible by 3 or by 5 or by both.

* Hint: For n=16, the output should be as follows.
    Divided by 3 -> 3, 6, 9, 12, 15.
    Divided by 5 -> 5, 10, 15.
    Divided by 3 and 5 -> 15.
 */

import java.util.Scanner;

public class Q4_FindNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);//Defines new scanner from scanner module

        System.out.print("Input your integer: "); //Asks user for input
        int n = scanner.nextInt();
        System.out.print("Divided by 3 -> ");
        for (int i =1; i<=n;i++){
        if (i%3==0){
            if (i+3>n){
                System.out.println(i +".");
            }
            else
                System.out.print(i +", ");
            }
        }

        System.out.print("Divided by 5 -> ");
        for (int i =1; i<=n;i++){
            if (i%5==0) {
                if (i + 5 > n) {
                    System.out.println(i + ".");
                }
                else {
                    System.out.print(i + ", ");
                }
            }
        }

        System.out.print("Divided by 3 and 5 -> ");
        for (int i =1; i<=n;i++){
            if ((i%3==0)&&(i%5==0)) {
                if ((i + 3 > n) || (i + 5 > n)) {
                    System.out.println(i + ".");
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }

}
