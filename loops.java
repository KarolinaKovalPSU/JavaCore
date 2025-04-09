
/*

Write Java code to prompt the user for a lower bound and an upper bound. Use a loop to output all of the even integers within the range requested by the user on a single line.
*/

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Prompt for lower and upper bounds
        System.out.println("Enter the lower bound: ");
        int lowerBound = in.nextInt();

        System.out.println("Enter the upper bound: ");
        int upperBound = in.nextInt();

        System.out.println("Even numbers in the range: ");

        //Loop and print even numbers
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        in.close();

    }
}