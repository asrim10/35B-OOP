package practiceques;

import java.util.Scanner;

public class emailValidator {
       public static void main(String[] args) {
    System.out.println("Enter an email: ");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();


        if(email.indexOf("@")>0&&email.indexOf(".")>email.indexOf("@")){
            if(email.contains("@")&&email.contains(".")){
                System.out.print("Valid email: ");
                System.out.print(email);
            }
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Email should contain @ and . symbols");
        }
        
    }
}

/*Design and implement a Simple Java application that womptS the user to enter a valid
email address. Your application Should throw and handle a Custm exceptiM if the user
enters an invalid email address.
InvalidEmaiIException:
A custom exception that is thrown when the user enters an email address that does not
match a valid email pattern (e.g., it should contain and characters). */