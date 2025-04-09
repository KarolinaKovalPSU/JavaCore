/*
This is a simple Accounting application that allows the user to:
1. View the account balance;
2. Deposit funds and view the new balance;
3. Withdraw funds and view the new balance;
4. Quit the application.

The program prints an error statement if the input is an integer outside of the required values.
It does not handle input other than integers.

 */

import java.util.Scanner;

public class accounting {

    public static void main(String[] args) {

        //setting up the initial balance and introducing other variables
        double balance = 3275.65;
        double deposit = 0;
        double withdrawal = 0;

        //initializing a scanner
        Scanner in = new Scanner(System.in);

        //initial prompt
        System.out.println("Enter the number of your desired transaction type.");
        System.out.println();
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Quit");
        System.out.println("Enter choice: ");

        //reading user input
        int userInput = in.nextInt();

        //printing the output depending on the user input
        switch (userInput) {

            case 1: //balance choice

                System.out.printf("Your current balance is $%.2f", balance);
                break;

            case 2: //deposit choice

                System.out.println("Enter the amount of the deposit: ");
                deposit = in.nextDouble();
                balance += deposit;
                System.out.printf("Your current balance is $%.2f", balance);
                break;

            case 3: //withdrawal choice

                System.out.println("Enter the amount of the withdrawal: ");
                withdrawal = in.nextDouble();

                if (withdrawal <= balance) {

                    balance -= withdrawal;
                    System.out.printf("Your current balance is $%.2f", balance);
                    break;

                } else {

                    System.out.printf("Insufficient funds. Your current balance is $%.2f", balance);
                }
                break;

            case 4: //quit choice

                System.out.println("Goodbye!");
                break;

            default: // if the user input is not between 1 and 4, print the invalid choice statement

                System.out.println("Invalid menu choice.");
                break;
        }

        in.close(); //close the scanner
    }

}

/*
TEST CASES:
Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
1
Your current balance is $3275.65
Process finished with exit code 0
--------------------------------------------

Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
2
Enter the amount of the deposit:
100
Your current balance is $3375.65
Process finished with exit code 0
---------------------------------------------

Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
3
Enter the amount of the withdrawal:
100
Your current balance is $3175.65
Process finished with exit code 0
----------------------------------------------

Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Goodbye!

Process finished with exit code 0

-------------------------------------------------

Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
5
Invalid menu choice.
--------------------------------------------------

Enter the number of your desired transaction type.

1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
j
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Main.main(accounting.java:25)

Process finished with exit code 1
 */