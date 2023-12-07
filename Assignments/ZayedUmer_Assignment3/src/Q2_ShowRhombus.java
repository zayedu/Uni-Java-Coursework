/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    /* place your subroutine code here */
    static void buildRhombus(int n) {
      for (int i = 1; i <= n;i++){
          System.out.print(" ".repeat((n-i)));

          for (int h = i; h>1;h--){

              System.out.print(h);
          }
          for (int j = 1; j<=i; j++) {
              System.out.print(j);
          }
          System.out.println();
      }
      for (int k = n; k>0; k--){
          System.out.print(" ".repeat((n-k+1)));

          for(int l = k-1; l > 1; l--){
              System.out.print(l);
          }
          for (int m= 1; m<=k-1;m++){
              System.out.print(m);
          }
          System.out.println();

      }
    }

    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        /* place your code to run your subroutine here */
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        buildRhombus(n);

    }
}
