/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program to find the value of following expression.
    a) (101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

 * INPUT: n/a
 * OUTPUT: the value of each of the above expressions.

 */


public class Q1_ExpressionSolution {
    public static void main(String[] args) {
        System.out.println((101+0)/3); //Simply print the first value
        System.out.println((3.0e-6 * 10000000.1));//Simply print the second value
        System.out.println((true && true));//Simply print the third value
        System.out.println((false && true));//Simply print the fourth value
        System.out.println(((false && false) || (true && true)));//Simply print the fifth value
        System.out.println(((false || false) && (true && true)));//Simply print the sixth value


    }
}
