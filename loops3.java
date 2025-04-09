
/*

Write Java code that prompts a clerk for the price of each item purchased by the customer and calculate their total. Use a do while loop to allow for the clerk to enter as many items as necessary.  Use 0 as a sentinel.  If the customer spends at least $75, they receive a 20% discount.  If the customer qualifies for the discount, output a statement informing them of this as well as their new total with the discount applied.  If the customer does not qualify, only output their total.  Be sure to format your output.
*/

import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        double price;

        System.out.println("Enter the price of each item (Enter 0 to finish): ");

        //Do-while loop to allow multiple entries
        do {
            System.out.print("Enter item price: $");
            price = in.nextDouble();

            if (price < 0)
            {
                System.out.println("Invalid price. Please enter a non-negative value.");
            }
            else
            {
                total += price;
            }

        } while (price != 0); //Stop when user enters 0

        //Loop to check if customer qualifies for discount
        if (total >= 75)
        {
            double discount = total * 0.20; // 20% discount
            double discountedTotal = total - discount;
            System.out.printf("You qualify for a 20%% discount!\nYour new total is: $%.2f\n", discountedTotal);
        }
        else
        {
            System.out.printf("Total amount due: $%.2f\n", total);
        }

        in.close();
    }
}
