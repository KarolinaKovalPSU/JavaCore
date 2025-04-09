/*Write a Java program to determine the topic in IST 140.

1. Ask the user to enter the day of the week:  Monday, Wednesday, or Friday.

2. Ask the user to enter the number of the module 1,  2, or  3.

3. For entries:

    If it is Monday or Wednesday, and it is module 1, output “The topic is Hello World.”

    If it is Monday or Wednesday,  and it is module 2, output “The topic is data types.”

    If it is Monday or Wednesday, and it is module 3, output “The topic is decisions.”

4. Otherwise, print the message “Invalid entry.”

*/


import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week:  Monday, Wednesday, or Friday.");
        String weekDay = scanner.nextLine();

        System.out.println("Enter the number of the module 1,  2, or 3.");
        int numModule = scanner.nextInt();

        if (weekDay.equals("Monday") || weekDay.equals("Wednesday"))
        {
            if (numModule == 1)
            {
                System.out.println("The topic is Hello World.");
            }
            else if (numModule == 2)
            {
                System.out.println("The topic is data types.");
            }
            else if (numModule == 3)
            {
                System.out.println("The topic is decisions.");
            }

        }

        else
        {
            System.out.println("Invalid entry");
        }
    }
}
