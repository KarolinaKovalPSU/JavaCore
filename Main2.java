
/*2. Write a Java program for the following algorithm:

Create a String containing the word "alphabetsoup".

Break up the word into three smaller words "alpha", "bet", and "soup" using the

Java substring method. Assign each substring to a separate String variable.

Print the three words in reverse order using the variables.

Print the second character of the second word.



Sample Output:

Your new word is soupbetalpha

The second character of the second word is e

*/



public class Main2 {
    public static void main (String[] args){
        String initialString = "alphabetsoup";
        String string1 = initialString.substring(0,5);
        String string2 = initialString.substring(5,8);
        String string3 = initialString.substring(8,12);

        char magic = string2.charAt(1);

        System.out.println("Your new word is: " + string3 + string2 + string1);
        System.out.println("The second character of the second word is " + magic);
    }


}
