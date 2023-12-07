/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q3_TransposeMatrix {
    /* place your subroutine code here */
    public static int [][] transposeMatrix(int [][] arr,int coloumns,int rows){
        //Nested for loop index starts at 0, i < size , create inner loop
        int Transpose[][]=new int[rows][coloumns];
        for (int i = 0; i<coloumns;i++){
            for (int j =0; j <rows; j++){
               Transpose[j][i]=arr[i][j];
            }
        }

        return Transpose;
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
               System.out.println("Here is your array \n"+Arrays.deepToString(twoD).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

            }
        }
        System.out.println("\nHere is your transposed matrix: ");
        System.out.println(Arrays.deepToString(transposeMatrix(twoD,rows,columns)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
