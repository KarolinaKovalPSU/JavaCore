import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
1.
Write a Java program to prompt a user to enter two words.
Then, pass these values as parameters in a method called checkSimilarities.
Use this method to check if both words have the same number of upper and lowercase letters.
Return true if both words contain the same amount of upper and lowercase letters, false if not.
Print the results.
*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter two words
            System.out.print("Enter the first word: ");
            String word1 = scanner.nextLine();

            System.out.print("Enter the second word: ");
            String word2 = scanner.nextLine();

            // Check similarities
            boolean result = checkSimilarities(word1, word2);

            // Print result
            if (result) {
                System.out.println("Both words contain the same amount of upper and lowercase letters.");
            } else {
                System.out.println("Both words DO NOT contain the same amount of upper and lowercase letters.");
            }

            scanner.close();
        }

        // Method to check letter case similarities
        public static boolean checkSimilarities(String w1, String w2) {
            int upper1 = 0, lower1 = 0;
            int upper2 = 0, lower2 = 0;

            // Count for first word
            for (char c : w1.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upper1++;
                } else if (Character.isLowerCase(c)) {
                    lower1++;
                }
            }

            // Count for second word
            for (char c : w2.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upper2++;
                } else if (Character.isLowerCase(c)) {
                    lower2++;
                }
            }

            // Compare counts
            return (upper1 == upper2) && (lower1 == lower2);
        }

/*
2.
Write a Java program that works similar to an ATM.
First, prompt a user to enter their account balance in dollar amount.
Store this value inside a double for initial balance
Then, create a loop that prompts a user to choice between four menu options:
Withdrawal, Deposit, View Balance, and Exit.
If user selects one of the three methods, call that specific method.
If user selects exit, exit the loop.

Within the loop, output the menu list below:
1. Withdrawal
2. Deposit
3. View Balance
4. Exit

This will require three methods:
a. Withdrawal - Takes one parameter of type double (balance) and returns a double (updated balance).
Prompt user to enter amount to withdrawal (take money out).
Check if amount withdrawal does not exceed balance.
If so, print an error and exit the method.
If not, calculate the new balance with the amount taken out and return the updated balance.
b. Deposit - Takes one parameter of type double (balance) and returns a double (updated balance).
Prompt user to enter amount to deposit (put money in).
Calculate the new balance with the user's deposit and return the updated balance.
c. View Balance - Takes one parameter of type double and returns nothing.
Print out the updated balance.
*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter initial balance
            System.out.print("Enter your initial account balance: $");
            double balance = scanner.nextDouble();

            boolean running = true;

            while (running) {
                // Display menu
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Withdrawal");
                System.out.println("2. Deposit");
                System.out.println("3. View Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        balance = withdrawal(balance);
                        break;
                    case 2:
                        balance = deposit(balance);
                        break;
                    case 3:
                        viewBalance(balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select an option from 1 to 4.");
                }
            }

            scanner.close();
        }

        // a. Withdrawal method
        public static double withdrawal(double balance) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();

            if (amount > balance) {
                System.out.println("Error: Withdrawal amount exceeds current balance.");
                return balance;
            } else {
                balance -= amount;
                System.out.printf("Withdrawal successful. New balance: $%.2f\n", balance);
                return balance;
            }
        }

        // b. Deposit method
        public static double deposit(double balance) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to deposit: $");
            double amount = scanner.nextDouble();

            balance += amount;
            System.out.printf("Deposit successful. New balance: $%.2f\n", balance);
            return balance;
        }

        // c. View Balance method
        public static void viewBalance(double balance) {
            System.out.printf("Your current balance is: $%.2f\n", balance);
        }

        }

    }
