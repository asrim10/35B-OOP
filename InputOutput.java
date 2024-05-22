import java.util.Scanner;
/*
 * or use
 * import java.util.*; //impoetrss all utils
 */
public class InputOutput {
    public static void main(String[] args) {
        // /*User output
        // System.out.println("Print next Line ");
        // "sout" for shortcut*/
        // System.out.println("This string breaks line");
        // /*System.out.print();*/
        // System.out.print("This will not break line");
        // System.out.print("This will continue\n");
        
        // /*System.out.printf
        //  * String formatter
        //  * %s String, %d Integer, %f Floating point, %b boolean 
        // */
        // System.out.printf("Hello %s, Nice", "world");
        // System.out.printf("This is num %d", 10);
        // /*You can use multiple formatter */
        // System.out.printf("Num %f and bool %b", 10.3f,false);   

        // /*User input */
        // Scanner scan=new Scanner(System.in);
        // System.out.println(("This following takes whole sentence"));
        // String wholeWString=scan.nextLine();
        // System.out.println("The input is" + wholeWString);
        // System.out.println("The following takes integer");
        // int intInput= scan.nextInt();
        // System.out.println("The input is" + intInput);
        // System.out.println("The following takes double");
        // double doubleInput=scan.nextDouble();
        // System.out.println(("The input is" +doubleInput));
        // System.out.println("The following takes boolean");
        // boolean booleanINput=scan.nextBoolean();
        // System.out.println("The input is" + booleanINput);
        // scan.close(); // close after taking all input
        
        
        /*Task
         * Make a new scanner object/variable scan1
         * Prompt the following
         * What is your name? -> save as string,name
         * Are you over 12? -> save as boolean, status
         * How many siblings? -> save as int , sibling
         * Print the follwing:
         * Hello, Name
         * Over 18? Status
         * You have sibling number of sibling
         */
        
         Scanner scan1=new Scanner(System.in);
         System.out.println("What is your name?");
         String name=scan1.nextLine();
         System.out.println("Hello," + name);
         System.out.println("Are you over 18? ");
         boolean status=scan1.nextBoolean();
         System.out.println("Over 18? " + status);
         System.out.println("How many siblings?");
         int sibling=scan1.nextInt();
         System.out.println("You have " + sibling + " num of siblings");
         scan1.close();
         
    }
    
}
