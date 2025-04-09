/*
  4. Write Java code to prompt the user for a word. Use a for loop to
   determine the number of uppercase letters and the number of lowercase letters
   entered by the user. Output the totals for each.
*/

import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompt user for a word
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        //Loop through each character in the word
        for (int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);

            if (Character.isUpperCase(letter))
            {
                uppercaseCount++;
            }
            else if (Character.isLowerCase(letter))
            {
                lowercaseCount++;
            }
        }

        //Output results
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);

        in.close();

    }
}
