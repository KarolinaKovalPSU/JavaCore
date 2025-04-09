/**
 * Program Name: AreaCalculator.java
 * Author: Karolina Koval
 * Description:
 *     This program calculates the area of various shapes including circle, triangle,
 *     rectangle, square, and trapezoid. It uses methods for each shape calculation
 *     and continues running until the user chooses to exit.
 */

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            printOptions();
            System.out.print("Please enter your option (0-5): ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Please enter the radius of the circle: ");
                    double radius = input.nextDouble();
                    System.out.printf("The area of the circle is %.3f\n\n", circle(radius));
                    break;
                case 2:
                    System.out.print("Please enter the base of the triangle: ");
                    double base = input.nextDouble();
                    System.out.print("Please enter the height of the triangle: ");
                    double triHeight = input.nextDouble();
                    System.out.printf("The area of the triangle is %.3f\n\n", triangle(base, triHeight));
                    break;
                case 3:
                    System.out.print("Please enter the width of the rectangle: ");
                    double width = input.nextDouble();
                    System.out.print("Please enter the height of the rectangle: ");
                    double rectHeight = input.nextDouble();
                    System.out.printf("The area of the rectangle is %.3f\n\n", rectangle(width, rectHeight));
                    break;
                case 4:
                    System.out.print("Please enter the side of the square: ");
                    double side = input.nextDouble();
                    System.out.printf("The area of the square is %.3f\n\n", square(side));
                    break;
                case 5:
                    System.out.print("Please enter the top of the trapezoid: ");
                    double top = input.nextDouble();
                    System.out.print("Please enter the bottom of the trapezoid: ");
                    double bottom = input.nextDouble();
                    System.out.print("Please enter the height of the trapezoid: ");
                    double trapHeight = input.nextDouble();
                    System.out.printf("The area of the trapezoid is %.3f\n\n", trapezoid(top, bottom, trapHeight));
                    break;
                default:
                    System.out.printf("Unknown option %d. Please try again.\n\n", choice);
            }

        } while (choice != 0);
    }

    /** Prints menu options */
    public static void printOptions() {
        System.out.println("********** Area Calculator **********");
        System.out.println("0) Exit");
        System.out.println("1) Circle");
        System.out.println("2) Triangle");
        System.out.println("3) Rectangle");
        System.out.println("4) Square");
        System.out.println("5) Trapezoid");
    }

    /**
     * Returns the constant value of pi.
     * @return the value 3.14159
     */
    public static double pi() {
        return 3.14159;
    }

    /**
     * Calculates the area of a circle.
     * @param radius the radius of the circle
     * @return the calculated area of the circle
     */
    public static double circle(double radius) {
        return pi() * radius * radius;
    }

    /**
     * Calculates the area of a triangle.
     * @param base the base length of the triangle
     * @param height the height of the triangle
     * @return the calculated area of the triangle
     */
    public static double triangle(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * Calculates the area of a rectangle.
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @return the calculated area of the rectangle
     */
    public static double rectangle(double width, double height) {
        return width * height;
    }

    /**
     * Calculates the area of a square.
     * @param side the length of one side of the square
     * @return the calculated area of the square
     */
    public static double square(double side) {
        return side * side;
    }

    /**
     * Calculates the area of a trapezoid.
     * @param top the length of the top side of the trapezoid
     * @param bottom the length of the bottom side of the trapezoid
     * @param height the height of the trapezoid
     * @return the calculated area of the trapezoid
     */
    public static double trapezoid(double top, double bottom, double height) {
        return ((top + bottom) / 2) * height;
    }
}

/*
TEST CASES:
---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 1
Please enter the radius of the circle: 5.2
The area of the circle is 84.949

---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 2
Please enter the base of the triangle: 10
Please enter the height of the triangle: 4.6
The area of the triangle is 23.000

---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 3
Please enter the width of the rectangle: 2.5
Please enter the height of the rectangle: 6.5
The area of the rectangle is 16.250

---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 4
Please enter the side of the square: 4.56789
The area of the square is 20.866

---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 5
Please enter the top of the trapezoid: 1.2
Please enter the bottom of the trapezoid: 3.4
Please enter the height of the trapezoid: 6
The area of the trapezoid is 13.800

---------------
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 6
Unknown option 6. Please try again.

---------------
*/

