/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q1_FindMinimum {
    /* place your subroutine code here */

    public static int findSmallest(int [] array, int N){
        int s=0;
        int min_value=array[0];
        for (int i =0; i<N;i++){
            if (min_value>array[i]){
                min_value=array[i];
            }
        }
        s = min_value;
        return s;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */

        int [] arr = new int [100];
        System.out.println("Enter each int of your array seperated by a space, input \"end\" to finish");
        Scanner scanner =new Scanner(System.in);
        String input;


        int index =0;
        while (true){
            input=scanner.next();
            if (input.equals("end")){
                break;

            }
            else {
                arr[index]=Integer.parseInt(input);
                index++;
            }
        }
        int N=10000;
        while (N>index){
            System.out.print("Enter the first N elements you want to check: ");
            N=scanner.nextInt();
        }

        System.out.println(findSmallest(arr,N));
    /*    for (int i =0; i<index;i++){
            System.out.println(arr[i]);
        }

     */
    }
}


