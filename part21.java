
import java.util.Scanner;
public class part21 {

    public static String coinFlip (int random) {

       String result = "";
        if (random == 0) {
            result = "Tails";
            System.out.println(result);
        }
        else if (random == 1){
            result = "Heads";
            System.out.println(result);
        }
    return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of coin flips greater than 0: ");
        int numFlips = input.nextInt();

        for (int i = 1; i <= numFlips; i++) {
            int random = (int) Math.random();
            coinFlip(random);

        }

    }
}
