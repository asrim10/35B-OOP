package practiceques;

import java.util.Scanner;

public class StringLengthValidator {

    public static void main(String[] args) {
        System.out.println("Enter a string between 5 to 20 characters");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        int lengthofString=string1.length();

        if(lengthofString > 5 && lengthofString < 20){
            System.out.println("You typed: "+string1);
            
        }
        else{
            throw new ArithmeticException("String length out of range");
        }
    }
}
/*Design and implement a simple Java application that prompts the user to enter a string
within a length, for example. between 5 and 20 characters. Your application
should throw and handle a custom exæption if the user enters a string outside this
• InvalidStringLengthException:
A custom exception that is thrown when the user enters a string with a length Outside the
valid range (5 to 20 characters).
 */