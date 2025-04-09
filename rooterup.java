/*
This program gets a positive integer (i.e. any number greater than 0) called "stop"
from the user at the command line using a Scanner object;
and then finds the square root of every number from 1 up
through and including stop number.
 */


import java.util.Scanner;
public class rooterup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stop;

        //Validate user input
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                stop = scanner.nextInt();
                if (stop > 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a positive integer greater than 0.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
                scanner.next(); //Clear invalid input
            }
        }

        //Compute and display square roots
        int i = 1;
        while (i <= stop) {
            System.out.printf("sqrt(%d) = %.3f%n", i, Math.sqrt(i));
            i++;
        }

        scanner.close();

    }
}


/*
TEST CASES:
---------------------------------------------

Enter a positive integer: 8
sqrt(1) = 1.000
sqrt(2) = 1.414
sqrt(3) = 1.732
sqrt(4) = 2.000
sqrt(5) = 2.236
sqrt(6) = 2.449
sqrt(7) = 2.646
sqrt(8) = 2.828

Process finished with exit code 0

-----------------------------------------------

Enter a positive integer: 1
sqrt(1) = 1.000

Process finished with exit code 0

-----------------------------------------------
Enter a positive integer: 0
Error: Please enter a positive integer greater than 0.
Enter a positive integer: -1
Error: Please enter a positive integer greater than 0.
Enter a positive integer: 5
sqrt(1) = 1.000
sqrt(2) = 1.414
sqrt(3) = 1.732
sqrt(4) = 2.000
sqrt(5) = 2.236

Process finished with exit code 0

---------------------------------------------------
Enter a positive integer: nlll;
Error: Invalid input. Please enter a positive integer.
Enter a positive integer: 2
sqrt(1) = 1.000
sqrt(2) = 1.414

Process finished with exit code 0
 */