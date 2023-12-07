/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */
import java.util.HashMap;
import java.util.Scanner;
public class Q5_Roman2Integer {
    /* place your subroutine code here */
    public static int romanToNum(String roman){
        int num =0;
        //Call using map.get("I")
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char current_char;
        char next_char;
        int current_val;
        int next_val;
        for (int i =0; i<roman.length();i++) {

            current_char=roman.charAt(i);
            current_val=map.get(current_char);

            if (i != roman.length()-1 && map.get(roman.charAt(i+1))>current_val){
                num-=current_val;
            }else{
                num+=current_val;
            }

        }

        return num;
    }

    public static void main(String[] args){
        /* place your code to run your subroutine here */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your roman numeral: ");
        String roman = scanner.next().toUpperCase();
        System.out.println(roman+" -> "+romanToNum(roman));

    }
}
