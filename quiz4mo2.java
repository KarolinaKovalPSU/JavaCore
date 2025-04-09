
/*Write a FOR loop that computes the following:

The sum of all odd numbers between start and stop (inclusive),
when start and stop are read in as integers from user input.

 */
import java.util.Scanner;

public class quiz4mo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for a start value
        System.out.println("Type a start integer: ");
        int start = input.nextInt();

        //prompt user for a stop value
        System.out.println("Type a stop integer: ");
        int stop = input.nextInt();

        //for loop with odd numbers

        for (int i = start; i <= stop; i+=2) {

            if (start % 3 ==0 && stop % 3 == 0)
            {
                stop += i;

            }
            System.out.println(i);
        }

    }
}
