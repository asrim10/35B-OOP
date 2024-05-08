import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char charValue = 'b' ;
        int intValue = 10;
        switch (charValue) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch (intValue) {
                    case 10:
                        System.err.println("Ten");
                        break;
                    case 20 :
                        System.out.println("Twenty");
                        break;
                }
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        /*Task
         * Use switch case for the following
         * 0-Sunday
         * 1-Monday
         * 2-Tuesday
         * 3-Wednesday
         * 4-Thursday
         * 5-Friday
         * 6-Saturday
         * rest- Invalid
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int day=scanner.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
            System.out.println("Invalid");
                break;
    }
    scanner.close();
    }  
}
