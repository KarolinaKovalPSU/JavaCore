/*
This is a program to calculate a course grade given points
for homework, quizzes, midterm exam, and final exam.
Grades are calculated differently for undergrads, grads and distance learners.
 */

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read input
        String status = in.next();
        double homeworkPoints = in.nextDouble();
        double quizPoints = in.nextDouble();
        double midtermPoints = in.nextDouble();
        double finalPoints = in.nextDouble();

        // Valid student statuses
        if (!(status.equals("UG") || status.equals("G") || status.equals("DL"))) {
            System.out.println("Error: student status must be UG, G or DL");
            return;
        }

        // Calculate category averages
        double homework = Math.min((homeworkPoints / 800) * 100, 100);
        double quizzes = Math.min((quizPoints / 400) * 100, 100);
        double midterm = Math.min((midtermPoints / 150) * 100, 100);
        double finalExam = Math.min((finalPoints / 200) * 100, 100);

        // Print category averages
        System.out.printf("Homework: %.1f%%%n", homework);
        System.out.printf("Quizzes: %.1f%%%n", quizzes);
        System.out.printf("Midterm: %.1f%%%n", midterm);
        System.out.printf("Final Exam: %.1f%%%n", finalExam);

        // Determine course weight based on student status
        double courseAverage;
        switch (status) {
            case "UG":
                courseAverage = (homework * 0.20) + (quizzes * 0.20) + (midterm * 0.30) + (finalExam * 0.30);
                break;
            case "G":
                courseAverage = (homework * 0.15) + (quizzes * 0.05) + (midterm * 0.35) + (finalExam * 0.45);
                break;
            case "DL":
                courseAverage = (homework * 0.05) + (quizzes * 0.05) + (midterm * 0.40) + (finalExam * 0.50);
                break;
            default:
                return;
        }

        // Print course average
        System.out.printf("%s average: %.1f%%%n", status, courseAverage);

        // Determine letter grade
        char grade;
        if (courseAverage >= 90.0) {
            grade = 'A';
        } else if (courseAverage >= 80.0) {
            grade = 'B';
        } else if (courseAverage >= 70.0) {
            grade = 'C';
        } else if (courseAverage >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print course grade
        System.out.println("Course grade: " + grade);
    }

}

/*
Test Cases:
1. Input: UG 600.0 300.0 120.0 185.0
   Output:
   Homework: 75.0%
   Quizzes: 75.0%
   Midterm: 80.0%
   Final Exam: 92.5%
   UG average: 81.0%
   Course grade: B

2. Input: TL 600 300 120 180
   Output:
   Error: student status must be UG, G or DL

3. Input: UG 700.0 300.0 200.0 205.0
   Output:
   Homework: 87.5%
   Quizzes: 75.0%
   Midterm: 100.0%
   Final Exam: 100.0%
   UG average: 92.3%
   Course grade: A

4. Input: G 800.0 400.0 100.0 100.0
   Output:
   Homework: 100.0%
   Quizzes: 100.0%
   Midterm: 66.7%
   Final Exam: 50.0%
   G average: 65.8%
   Course grade: D

5. Input: DL 600.0 300.0 120.0 150.0
   Output:
   Homework: 75.0%
   Quizzes: 75.0%
   Midterm: 80.0%
   Final Exam: 75.0%
   DL average: 77.0%
   Course grade: C

6. Input: UG 800.0 400.0 150.0 200.0
   Output:
   Homework: 100.0%
   Quizzes: 100.0%
   Midterm: 100.0%
   Final Exam: 100.0%
   UG average: 100.0%
   Course grade: A
*/
