
/*
    2. Write Java code to create a basic integer guessing game. Generate a random
    value from 1 to 5 (inclusive). Use a while loop to prompt the user for a guess
    until they guess the value correctly. If the guess is incorrect, tell the user
    to try again. When the user guesses correctly exit the loop and output that they
    guessed correctly.
 */

import java.util.Random;
import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scnr = new Scanner(System.in);

        int randomNum = random.nextInt(5) + 1; //Generate a random number 1 to 5
        int guess = 0; //Store the user's guess here

        System.out.println("Guess a number between 1 and 5: ");

        //loop starts here - game goes on while the guess does not equal random number
        while (guess != randomNum)
        {
            System.out.print("Enter your guess: ");
            guess = scnr.nextInt();

            if (guess < 1 || guess > 5)  //guess is out of range
            {
                System.out.println("Out of range! Please guess a number between 1 and 5.");
            }
            else if (guess != randomNum) //guess does not equal random number
            {
                System.out.println("Wrong guess, try again!");
            }
        }

        //guess equals random number, exit loop
        System.out.println("Congratulations! You guessed the correct number: " + randomNum);

        scnr.close();

    }
}
