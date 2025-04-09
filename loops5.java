/*
  5. Use nested for loops to recreate the triangle shown below:

  * * * * *
  * * * *
  * * *
  * *
  *

*/


public class loops5 {
    public static void main(String[] args) {

        int rows = 5; //initializing rows

        //Loop that controls the size of the triangle
        for (int i = rows; i>=1; i--){
            //inner loop to print asterisks
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(); //move to the next line
        }


    }
}
