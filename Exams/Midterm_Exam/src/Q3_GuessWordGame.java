/* Midterm Exam (100 marks in total; 20% of the final grade of this course)
 *
 * Question 3 (40 marks)
 * Write a program that first takes an input word no longer than 3 characters from the host of the game.
 * Then, the program asks a player to guess what the word is.
 *
 * Only use the 26 characters in lower cases from the alphabet, that are: a, b, c, d, ..., x, y, z.
 *
 * The following is an example to show how the program should work step by step.
 *
 * 1. The program asks the host of the game to input a word no longer than 3 characters.
 * For example, let's assume the host inputs the word: "cat"
 *
 * 2. The program asks the player to iteratively guess what the word is, in a character-by-character manner.
 *
 * 3. If the player guesses a "h" for the first character. The program should display
 * "h has a greater alphabetic order than the first character." and then, it should ask the user to guess again by displaying
 * "please guess again."
 *
 * 4. If the player guesses a character "b" for the first character. The program should display
 * "b has a smaller alphabetic order than the first character." and then, it should ask the user to guess again by displaying
 * "please guess again."
 *
 * 5. if the player guesses a "c" for the first character. The program should display
 * "c is correct for the first character." and then, it should ask the user to guess the next character by displaying
 * "please guess the next character."
 *
 * 6. The program stops when any of the following two conditions is satisfied:
 *     Condition 1: the user failed more than 5 times when guessing one character. In this case, the program displays "Game failed." and stops
 *     Condition 2: the user successfully guesses the word. In this case, the program displays "Congratulations! Correct word is: cat" and stops.
 *
 * IMPORTANT NOTE 1: it is fine to either printing out the quote "" or not printing out the quote "". Grading will not be based on the display format of quote sign.
 */

import java.util.Scanner;

public class Q3_GuessWordGame {
    /* place your subroutine code here if there is any */


    public static void guessCheck(String s) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < s.length(); i++) {
            int correct_guess=0;
            boolean br=false;
            boolean cont = true;
            int count = 0;

            while (cont && count < 6) {
                System.out.print("Input your guess: ");
                String guess = scan.next();
                char guesschar = guess.charAt(0);

                if (count == 5) {
                    System.out.println("Game Failed.");

                    System.exit(0);

                }
                if (guesschar > s.charAt(i)) {
                    count++;

                    System.out.println(String.valueOf(guesschar) + " has a greater alphabetic order than the character.");
                } else if (guesschar < s.charAt(i)) {
                    count++;

                    System.out.println(String.valueOf(guesschar) + " has a smaller alphabetic order than the character.");
                } else {
                    System.out.println(String.valueOf(guesschar) + " is the correct guess");
                    cont = false;
                    correct_guess++;
                    if (i==s.length()-1){
                        System.out.println("Congrats the correct word was "+ s);
                    }


                }
            }

        }

    }


    public static void main(String args[])
    {
        /* Place your main code here */
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter your word: ");

        String word = scanner.next();

        guessCheck(word);

    }
}