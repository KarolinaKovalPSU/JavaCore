//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
This application gets a String of a single word with no white space
from the user at the command line, by using the Scanner object to read
input via the keyboard, and checks whether the String, called inputPassword,
conforms to the following password policy.
No whitespace is permitted in this password string.

The password must:

Be exactly 5 characters in length
Include at least one uppercase character
Include at least one lowercase character
Include at least one digit
If the password conforms to the policy, the app outputs "The provided password is valid."
Otherwise, the output is: "The provided password is invalid because it must be five characters
in length and include at least one digit, at least one uppercase, and at least one lowercase
character. Please try again."
 */

import java.util.Scanner;

public class passwordchecker {
    public static void main(String[] args) {

        //introducing a scanner
        Scanner in = new Scanner(System.in);

        //prompting the user for a password
        System.out.println("Enter your password: ");
        String inputPassword = in.nextLine();

        //initializing a boolean variable to check if all the conditions are true or false
        boolean validPassword = false;

        //checking all the conditions
        if (inputPassword.length() == 5) //input exactly 5 characters
        {
            char c1 = inputPassword.charAt(0);
            char c2 = inputPassword.charAt(1);
            char c3 = inputPassword.charAt(2);
            char c4 = inputPassword.charAt(3);
            char c5 = inputPassword.charAt(4);

            //using Character class and selection statements
            if ((Character.isUpperCase(c1) || Character.isUpperCase(c2) || Character.isUpperCase(c3) || Character.isUpperCase(c4) || Character.isUpperCase(c5)) &&
                    (Character.isLowerCase(c1) || Character.isLowerCase(c2) || Character.isLowerCase(c3) || Character.isLowerCase(c4) || Character.isLowerCase(c5)) &&
                    (Character.isDigit(c1) || Character.isDigit(c2) || Character.isDigit(c3) || Character.isDigit(c4) || Character.isDigit(c5)))
            {
                validPassword = true; //if everything is right, the boolean variable evaluates to true
            }
        }

        if (validPassword) //if the boolean value is true - print the validity statement
        {
            System.out.println("The provided password is valid.");
        }
        else //otherwise, print the error statement
        {
            System.out.println("The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.");
        }


    }

}

/*
Enter your password:
1234567
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
-----------------------------------------------

qwert
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
-----------------------------------------------

qwer1
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
-----------------------------------------------

Enter your password:
QWER1
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
----------------------------------------------

Enter your password:
Qwer1
The provided password is valid.

Process finished with exit code 0
-----------------------------------------------

Qwer1yu8
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
 */