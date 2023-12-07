/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Q3_RemoveDuplicates {
    /* place your subroutine code here */
    public static ArrayList<Integer> revSort (List<Integer> arr){
        int temp;
        boolean swapped;
        for (int i =0;i < arr.size()-1;i++){
            swapped = false;
            for (int j = 0; j< arr.size()-1-i;j++){
                if (arr.get(j)<arr.get(j+1)) {
                    temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set((j+1),temp);
                    swapped=true;
                }

            }
            if (swapped==false){
                break;
            }
        }
        int size = arr.size()-1;
       for (int i = 0; i<size;i++){
           if (arr.get(i)==arr.get(i+1)){
               arr.remove(i);
               size--;
               i--;
           }
       }


        return (ArrayList<Integer>) arr;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner scanner= new Scanner(System.in);
        System.out.print("How many elements in your list: ");
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0 ;i<n;i++){
            System.out.print("Enter element "+i+": ");
            int p = scanner.nextInt();
            arr.add(p);
        }
        System.out.println("Here is your array as you entered: \n"+arr);
       System.out.println("\n\nHere is your array sorted in non increasing order without duplicates: \n"+revSort(arr));
    }

}
