/* Midterm Exam (100 marks in total; 20% of the final grade of this course)
 *
 * Question 2 (35 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n, where 1 <= n <= 9.
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. The rhombus should follow the pattern of the following examples.
 * Your subroutine should directly print the result, and it should not return any value or variable.

 *
 * The following are two examples to show the pattern of the rhombus:
 * For n=7, the rhombus structure is:
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 12345654321
  123454321
   1234321
    12321
     121
      1

 * For n=3, the rhombus structure is:
  1
 121
12321
 121
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombusReverseOrder {
    /* place your subroutine code here if there is any */
    static void buildRhombus(int n) {
        for (int i = 1; i <= n;i++){
            System.out.print(" ".repeat((n-i)));

            for (int h = 1; h<=i;h++){

                System.out.print(h);
            }
            for (int j = i-1; j>0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int k = n-1; k>0; k--){
            System.out.print(" ".repeat((n-k)));

            for (int h = 1; h<=k;h++){

                System.out.print(h);
            }
            for (int j = k-1; j>0; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }


    public static void main(String args[])
    {
        /* Place your main code here */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        buildRhombus(n);
    }
}
