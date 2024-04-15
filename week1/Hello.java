package week1;

/* 1. Write a program that prints Hello World! to the console.
 Save the program as Hello.java.*/
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World!");

/* 2.Extend/Modify the above program to print two additional lines:
This is my first program
I am on module ST4003CEM
System.out.print (not println) and produces the same output. */  
System.out.print("\nThis is my first program \nI am on module ST4003CEM\n");

/*3. Write a program that prints the following output:
A "quoted" String is
'much' better if you learn
the rules of "escape sequences."
Also, "" represents an empty
String. Don't forget: use \"
instead of " !
'' is not the same as " */
System.out.print("\nA \"quoted\" String is\n\'much\' better if you learn \nthe rules of \"escape sequences\".");
System.out.print("\nAlso,represents an empty String.\nDon't forget: use\\\n\"instead of\"!\n\"is not the same as\"\n");


/*4. WAP that prints the following pattern:
*
**
***
**** 
*/

System.out.println("\n*");
System.out.println("**");
System.out.println("***");
System.out.println("****\n");

/*5. WAP prints the following pattern:
*********
*********
*********
*********
 */


    }
}