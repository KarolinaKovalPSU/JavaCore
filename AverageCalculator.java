import java.util.Scanner;

    /**
     * AverageCalculator.java
     * This program prompts the user for four numbers, calculates their average,
     * and then prints the numbers and their average with 2 decimal places.
     */
    public class AverageCalculator {
        public static void main(String[] args) {

            //Introducing a new scanner
            Scanner scnr = new Scanner(System.in);

            //Declaring four double variables with descriptive names.
            double num1, num2, num3, num4;

            // Prompting the user for four numbers one by one. Putting those input values into corresponding variables.
            System.out.println("Enter the first number:");
            num1 = scnr.nextDouble();

            System.out.println("Enter the second number:");
            num2 = scnr.nextDouble();

            System.out.println("Enter the third number:");
            num3 = scnr.nextDouble();

            System.out.println("Enter the fourth number:");
            num4 = scnr.nextDouble();

            // Once we have our input numbers, we can calculate the average
            double average = (num1 + num2 + num3 + num4) / 4.0;

            // finally, printing the numbers and their average with 2 decimal places
            System.out.printf("The average of the numbers %.2f, %.2f, %.2f, and %.2f is %.2f\n",
                    num1, num2, num3, num4, average);

            scnr.close(); // Close the scanner. Good practice.
        }
    }

/*
Sample Run 1:
Enter the first number:
30.25
Enter the second number:
25.5
Enter the third number:
100
Enter the fourth number:
42
The average of the numbers 30.25, 25.50, 100.00, and 42.00 is 49.44

Sample Run 2:
Enter the first number:
10
Enter the second number:
20
Enter the third number:
30
Enter the fourth number:
40
The average of the numbers 10.00, 20.00, 30.00, and 40.00 is 25.00

Sample Run 3:
Enter the first number:
-5
Enter the second number:
0
Enter the third number:
5
Enter the fourth number:
10
The average of the numbers -5.00, 0.00, 5.00, and 10.00 is 2.50
*/

