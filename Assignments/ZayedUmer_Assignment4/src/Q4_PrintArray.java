/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to use Method Overloading for printing three types of array:
 * Integer[], Character[] and Double[].
 *
 * Input: None.
 * Output: print out different types of array.
 *
 * There is no specific format as long as printed arrays are neatly and cleanly.
 *
 */
public class Q4_PrintArray {
    // creating a method for printing integer array
    /* place your code here */

    public static void printArray(Integer [] array){
        int len =array.length;
        for (int i =0; i<len;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    // overloading the above created method with different parameter method
    // contains a character parameter
    /* place your code here */
    public static void printArray(Character [] array){
        int len =array.length;
        for (int i =0; i<len;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }
    // overloading the above created method with different parameter method
    // contains a double parameter
    /* place your code here */
    public static void printArray(Double [] array){
        int len =array.length;
        for (int i =0; i<len;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        Character[] carr = {'A','B','C','D','E'};
        Double[] darr = {1.234, 2.345, 3.456, 4.567};

        // calling the methods and printing the arrays
        /* place your code here */
        printArray(iarr);
        printArray(carr);
        printArray(darr);



    }
}
