/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a java program, use "subroutine" to finish sorting a 2-dimension array.
 *
 * User input a 2-dimension array of double type, return it in non-decreasing
 * order according to values in the first raw, if there are two or more same
 * element in the first raw, keep the original sequence.
 *
 * INPUT: a user input 2-dimension array.
 * OUTPUT: sorted input array in non-decreasing order according to values in the first row.
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example 1
 * INPUT: if user input array (Order 2*4) is
 *        1.45  0.25  8.95  0.99
 *        2.56  5.67  0.47  2.65
 *
 * OUTPUT: 0.25  0.99  1.45  8.95
 *         5.67  2.65  2.56  0.47
 *
 * Example 2
 * INPUT: if user input array (Order 5*5) is
 *        0.95  0.23  0.95  0.95  0.65
 *        2.56  5.67  0.47  2.65  0.47
 *        1.45  0.25  8.95  0.99  0.67
 *        5.67  2.65  0.25  8.95  0.99
 *        1.23  4.21  0.97  7.64  8.52
 *
 * OUTPUT: 0.23  0.65  0.95  0.95  0.95
 *         5.67  0.47  2.56  0.47  2.65
 *         0.25  0.67  1.45  8.95  0.99
 *         2.65  0.99  5.67  0.25  8.95
 *         4.21  8.52  1.23  0.97  7.64
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Sort2DArray {
    /* place your subroutine code here */
    public static double [][] sortMatrix(double [][] newMatrix){
        int rows=newMatrix.length;
        int cols=newMatrix[0].length;
        double temp;
        //double newMatrix[][]  = new double[rows][cols];



            for(int k=0; k < cols; k++){
                for(int j=1; j < (cols-k); j++){
                    if(newMatrix[0][j-1] > newMatrix[0][j]){
                        //swap elements
                        for (int i =0; i<rows;i++) {
                            temp = newMatrix[i][j - 1];
                            newMatrix[i][j - 1] = newMatrix[i][j];
                            newMatrix[i][j] = temp;
                        }
                    }

                }
            }


        return newMatrix;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of coloumns: ");
        int columns = scanner.nextInt();
        double twoD[][]=new double[rows][columns];

        for (int  i = 0; i < rows; i++ ){
            for (int j = 0; j<columns; j++){
                System.out.print("Enter element i: "+ String.valueOf(i+1)+" j:"+String.valueOf(j +1 )+" ");
                twoD[i][j]= scanner.nextDouble();
                System.out.println("Here is your array \n"+ Arrays.deepToString(twoD).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

            }
        }

        System.out.println("\n\nHere is your sorted array :\n"+Arrays.deepToString(sortMatrix(twoD)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));


    }
}
