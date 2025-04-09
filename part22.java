
/*import java.util.Scanner;
public static void main (String[] args)
Scanner input = new Scanner(System.in);
int random = min + (int)(Math.random() * ((max - min) + 1));
for (int i=start; i<=end: i++) {}
while (condition) {}
public static datatype methodName(datatype parameter1, datatype parameter2) {}

 */

import java.util.Scanner;
public class part22 {

    public static int minNumber(int num1, int num2, int num3, int num4) {

        int min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;
        if (num4 < min) min = num4;
        return min;

    }

    public static int maxNumber(int num1, int num2, int num3, int num4) {

        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num4 > max) max = num4;
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type number 1: ");
        int num1 = input.nextInt();

        System.out.println("Type number 2: ");
        int num2 = input.nextInt();

        System.out.println("Type number 3: ");
        int num3 = input.nextInt();

        System.out.println("Type number 4: ");
        int num4 = input.nextInt();

        int numBiggest = maxNumber(num1, num2, num3, num4);
        int numSmallest = minNumber(num1, num2, num3, num4);

        System.out.printf("Maximum is: %d\n", numBiggest);
        System.out.printf("Minimum is: %d", numSmallest);
    }
}
