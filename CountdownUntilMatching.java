import java.util.Scanner;

public class CountdownUntilMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Read input
        int num = in.nextInt();

        //Validate input range
        if (num < 11 || num > 100) {
            System.out.println("Input must be 11-100");
            return;
        }

        while (true) {
            System.out.print(num + " ");

            //Extract tens and ones digits
            int tens = num / 10; // Extracts the tens place
            int ones = num % 10; // Extracts the ones place

            //Stop countdown if digits are identical
            if (tens == ones) {
                break;
            }

            num--; // Decrease number by 1
        }

        System.out.println(); // Newline at the end
    }
}

/*
TEST CASES:
-----------------------------

Type an integer from 11 to 100:
58
58 57 56 55

Process finished with exit code 0

---------------------------------

Type an integer from 11 to 100:
9
Input must be 11-100

Process finished with exit code 0

----------------------------------

Type an integer from 11 to 100:
574
Input must be 11-100

Process finished with exit code 0

---------------------------------

Type an integer from 11 to 100:
99
99

Process finished with exit code 0

----------------------------------

Type an integer from 11 to 100:
98
98 97 96 95 94 93 92 91 90 89 88

Process finished with exit code 0
 */