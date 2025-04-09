/*
This program represents a simple banking system based on an outer do loop.
It is designed to let the user see their account balance, perform deposits,
withdrawals, or simply quit the application.
It is also designed to keep track of the current balance during each iteration of the loop.
 */


import java.util.Scanner;

public class AccDoLoop {
    public static void main(String[] args) {

        //Initial account balance
        double balance = 1000.00;

        //Initializing a scanner
        Scanner scanner = new Scanner(System.in);

        //Introducing a choice variable outside the loop
        int choice;

        //Outer do loop
        do {
            //Menu options
            System.out.println("Enter the number of your desired transaction type.");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Quit");
            System.out.println("Enter choice: ");

            //Read user input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
                System.out.println("Enter choice: ");
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1: //Display balance
                    System.out.printf("Your current balance is $%.2f.%n", balance);
                    break;
                case 2: //Deposit
                    System.out.println("Enter deposit amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                        System.out.println("Enter deposit amount: ");
                    }
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Your current balance is $%.2f.%n", balance);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;
                case 3: //Withdrawal
                    System.out.print("Enter withdrawal amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                        System.out.println("Enter withdrawal amount: ");
                    }
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0) {
                        if (withdrawal <= balance) {
                            balance -= withdrawal;
                            System.out.printf("Your current balance is $%.2f.%n", balance);
                        } else {
                            System.out.printf("Insufficient funds. Your current balance is $%.2f.%n", balance);
                        }
                    } else {
                        System.out.println("Withdrawal amount must be positive.");
                    }
                    break;
                case 4: //Quit
                    System.out.println("Good-bye");
                    break;
                default:
                    System.out.println("Invalid menu choice.");
            }
        } while (choice != 4); //Continue looping until user chooses to quit

        scanner.close(); //Close scanner
    }
}

/*
TEST CASES:
---------------------------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
jljkp'poi
Invalid input. Please enter a number between 1 and 4.
Enter choice:
1
Your current balance is $1000.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Good-bye

Process finished with exit code 0

----------------------------------------------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
2
Enter deposit amount:
1000
Your current balance is $2000.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Good-bye

Process finished with exit code 0

------------------------------------------------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
3
Enter withdrawal amount: 1000
Your current balance is $0.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Good-bye

Process finished with exit code 0

------------------------------------------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
3
Enter withdrawal amount: 50
Your current balance is $950.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
7
Invalid menu choice.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
ioipipp
Invalid input. Please enter a number between 1 and 4.
Enter choice:
2
Enter deposit amount:
23
Your current balance is $973.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Good-bye

Process finished with exit code 0

------------------------------------------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
3
Enter withdrawal amount: 3000
Insufficient funds. Your current balance is $1000.00.
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:
4
Good-bye

Process finished with exit code 0
 */