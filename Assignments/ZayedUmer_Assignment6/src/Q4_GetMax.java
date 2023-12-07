/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a complete static method that finds the largest value in a 2-dimension array of ints.
 * The method should have one parameter, which is a 2d array of type int. The largest number
 * in the array should be returned as the value of the method.
 *
 * INPUT: user input a 2-dimension array of type int
 * OUTPUT: the largest number in input array
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * Input: 4  6  8
 *        5  8  9
 *        2  1  8
 * Output: 9
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q4_GetMax {
    /* place your code here */
    public static int findHighest(int [][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of coloumns: ");
        int columns = scanner.nextInt();
        int twoD[][]=new int[rows][columns];

        for (int  i = 0; i < rows; i++ ){
            for (int j = 0; j<columns; j++){
                System.out.print("Enter element i: "+ String.valueOf(i+1)+" j:"+String.valueOf(j +1 )+" ");
                twoD[i][j]= scanner.nextInt();
                System.out.println("Here is your array \n"+ Arrays.deepToString(twoD).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

            }
        }

        System.out.println("The max value of your array is: "+findHighest(twoD));
    }
}
