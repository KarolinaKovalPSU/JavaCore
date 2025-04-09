
/*Given an input integer, num, write a WHILE loop that prints out
all of the squares less than the value of num.

For example, if num is 100, print out the following:

0 1 4 9 16 25 36 49 64 81

 */
import java.util.Scanner;

public class quiz4mo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting user input
        System.out.println("Type an integer: ");
        int num = input.nextInt();

        //initializing a loop variable to store the value, outside the loop
        int i = 0;

        //while loop with squares
        while (Math.pow(i,2) < num){
            i = (int) Math.pow(i,2);
            System.out.print(i + " ");
            i++;
        }

    }
}
