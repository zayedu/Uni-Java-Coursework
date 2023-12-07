import java.util.Arrays;
import java.util.Scanner;

/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (30 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */
public class Q2_TwoSum {
    /* place your subroutine code here */
    public static int[] TwoSum(int [] nums,int target){
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j=i+1; j<n;j++){
                if (nums[j] + nums[i] == target){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};


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

        System.out.print("Enter your target: " );
        int target= scanner.nextInt();

        int [] ans = Q2_TwoSum.TwoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

}
