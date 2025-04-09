/*
The program ReverseStrings prompts the user for two strings:

1. The first string should be 3 characters long.
2. The second string should be 4 characters long.

If the user input does not include the mandatory number of characters in a string,
the program gives a warning and executes an exit.

If the user input is valid, the program prints 2 input strings as is,
followed by the same two strings with each character in the reverse order.

Each string in both outputs is separated by one space character.
 */

import java.util.Scanner;

public class ReverseStrings {
    public static void main (String[] args){

        Scanner scnr = new Scanner(System.in);

        

        /*Prompt the user for a 3-character string and write that string into a variable.
        Verify the input and exit if incorrect.
         */
        System.out.print("Type a 3-character string: ");
        String string3 = scnr.next();

        if (string3.length() != 3){
            System.out.println("Warning! A string must be 3 characters long.");
            System.exit(1);
        }

        /*Prompt the user for a 4-character string and write that string into a variable.
        Verify the input and exit if incorrect.
         */
        System.out.print("Type a 4-character string: ");
        String string4 = scnr.next();

        if (string4.length() != 4){
            System.out.println("Warning! A string must be 4 characters long.");
            System.exit(1);
        }

        /*
        Create two new string variables for reverse strings.
        Concatenate characters in reverse order. The "" forces string concatenation.
         */
        String reverseString3 = "" + string3.charAt(2) + string3.charAt(1) + string3.charAt(0);
        String reverseString4 = "" + string4.charAt(3) + string4.charAt(2) + string4.charAt(1) + string4.charAt(0);

        //Print the initial strings and the reversed strings.
        System.out.println("The two strings you entered are: " + string3 + " " + string4);
        System.out.println("The two strings in reverse are: " + reverseString4 + " " + reverseString3);
    }
}

/*
Type a 3-character string: use
Type a 4-character string: this
The two strings you entered are: use this
The two strings in reverse are: siht esu

Process finished with exit code 0
----------------------------------------------

Type a 3-character string: this and that
Warning! A string must be 3 characters long.

Process finished with exit code 1
----------------------------------------------

Type a 3-character string: omg
Type a 4-character string: qwerty
Warning! A string must be 4 characters long.

Process finished with exit code 1
-----------------------------------------------

Type a 3-character string: omg
Type a 4-character string: look
The two strings you entered are: omg look
The two strings in reverse are: kool gmo

Process finished with exit code 0

 */