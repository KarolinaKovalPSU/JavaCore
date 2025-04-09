/*
This program takes a single character and a string and outputs the number
of occurrences of the given character in the given string.
 */

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        // Initializing a scanner
        Scanner in = new Scanner(System.in);

        // Prompting the user for a single character on the same line
        System.out.print("Enter a single character: ");
        char singleChar = in.next().charAt(0);
        in.nextLine();

        // Prompting the user for a string
        System.out.println("Enter an input string: ");
        String inputString = in.nextLine();

        // Count occurrences of the character
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == singleChar) {
                count++;
            }
        }

        // Printing out the result
        if (count == 1) {
            System.out.println("Results: " + count + " " + singleChar);
        } else {
            System.out.println("Results: " + count + " " + singleChar + "'s");
        }

        // Close scanner
        in.close();
    }
}


/*
TEST CASES
-----------------------------------------
Enter a single character: n
Enter an input string: Monday
Results: 1 n

Process finished with exit code 0

------------------------------------------

Enter a single character: z
Enter an input string: Today is Monday
Results: 0 z's

Process finished with exit code 0

-------------------------------------------
Enter a single character: n
Enter an input string: It's a sunny day
Results: 2 n's

Process finished with exit code 0

--------------------------------------------
Enter a single character: n
Enter an input string: Nobody
Results: 0 n's

Process finished with exit code 0

 */