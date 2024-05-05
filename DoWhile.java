import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*Check the ssame condition in while and do while for difference */
        int counter=0;
        while (counter<0) {
            System.out.println("THE condition is false, it wont run");
        }
        do{
            System.out.println("This runs first then checks the condition");
        }while (counter<0);
        /*Do while run at least once, even if the condition is false */

        /*Task
         * Prompt user to enter a number
         * run loop and ask user the integer until the
         * integer is negative
         */
        /*WHile */
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Please enter a number");
        // int input;
        // int inputInt=scan.nextInt();
        // while (inputInt>0) {
        //     System.out.println("Integer is positive");
        //     inputInt=scan.nextInt();
        // }
        // System.out.println("Condition matched "+ inputInt);
        // scan.close();
        Scanner scan=new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a negative");
            input=scan.nextInt();
        }while (input>0);
        System.out.println("Negative Number" + input);
        scan.close();
    }
    
}
