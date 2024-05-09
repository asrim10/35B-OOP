package week4;
import java.util.*;

public class taskk {
    public static void main(String[] args) {
        /*1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        for(int i=0 ;i<5 ; i++){
        System.out.println("Hello " +name);
        }
        scan.close();

        /*2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
    Miles    Kilometers
        1    1.609
        2    3.218 
        …    ….
        9    14.481
        10    16.090 */
        double km=1.609;
        for(int i=1; i<=10; i++){
            System.out.print(i +"   ");
            System.out.println(i*km);
        }
        /*3. Write a program that generates the following table: 
        Number    Square
        10    100
        9    81
        ..    ….2    4
        1    1 */
        for (int i=10;i>0;i--){
        System.out.print(i+"   ");
        System.out.println(i*i);
        }

    /*4. Write a program that reads the width and generates a corresponding square of *. 
    For example, if width = 5, output is:
    *****
    *****
    *****
    *****
    ***** */
    Scanner scan1= new Scanner(System.in);
    System.out.println("Enter Width of square");
    int width=scan1.nextInt();
    for(int i = 0; i < width;i++){
        for(int j=0;j<width;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    scan1.close();
    
    /*5. Modify the above program by using a 
    do..while loop so that it provides the user 
    with the option to continue running the program and enter more inputs. */

    Scanner scanner = new Scanner(System.in);
    char choice;
    do {
        // Read the width from the user
        System.out.print("Enter the width of the square: ");
        int width1 = scanner.nextInt();
        
        // Generate the square of asterisks
        for (int i = 0; i < width1; i++) {
            for (int j = 0; j < width1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Ask user if they want to continue
        System.out.print("Do you want to continue? (y/n): ");
        choice = scanner.next().charAt(0);
    } while (choice == 'y' || choice == 'Y');
    
    scanner.close();

    /*6. Write a program that reads the width and generates a corresponding triangle of *.
     For example, if width = 5, output is:
        *
        **
        ***
        ****
        ***** */
        Scanner scan2= new Scanner(System.in);
        System.out.println("Enter Width of Triangle");
        int width2=scan2.nextInt();
        for(int i = 0; i < width2;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan2.close();

    /*7. Write a program to calculate the HCF of Two given numbers. */
    Scanner scanner1=new Scanner(System.in);
    System.out.println("ENter First number");
    int num1=scanner1.nextInt();
    System.out.println("Enter second number");
    int num2=scanner1.nextInt();
    int min=Math.min(num1, num2);
    int hcf=1;
    for(int i =1;i <= min;i++){
        if (num1 % i == 0 && num2 %i == 0) {
            hcf=i;
        }
    }
    System.out.println("The HCF of "+num1+" and " + num2 +" = " +hcf);
    scanner1.close();

    /*8. Write a program that prompts the user to input an integer and
     then outputs the number with the digits reversed. 
    \For example, if the input is 12345, the output should be 54321. */
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner2.nextInt();
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num /= 10;
        }
       System.out.println("Reversed number = " +reversed);
       scanner2.close();

    /*9. Write a program that reads ten integer numbers and outputs 
    the number of inputs which are greater than 50, less than 50 or equal to 50.
     The program should also display the average of all numbers 
     greater than 50 and the average of all numbers less than 50. */
     Scanner scanner3=new Scanner(System.in);
     int countGreaterThan50=0;
     int countLessThan50=0;
     int countEqualto50=0;
     int sumGreaterthan50=0;
     int sumlessthan50=0;
     for(int i =1;i<=10;i++){
        System.out.println("Enter number " + i +" = ");
        int n=scanner3.nextInt();

        if(n>50){
            countGreaterThan50++;
            sumGreaterthan50+=n;    
        }else if(n<50){
            countLessThan50++;
            sumlessthan50+=n;
        }else{
            countEqualto50++;
        }
     }
     double avgGreaterThan50=countGreaterThan50>0? (double) sumGreaterthan50/countGreaterThan50 : 0;
     double avgLessThan50= countLessThan50>0? (double) sumlessthan50/countLessThan50 : 0;
     System.out.println("Number of inputs Greater than 50 = "+ countGreaterThan50);
     System.out.println("Number of inputs less than 50 = "+ countLessThan50);
     System.out.println("Number of inputs equal to 50 = " + countEqualto50);
     System.out.println("Average of inputs greater than 50 = " +avgGreaterThan50);
     System.out.println("Average of inputs less than 50 = " + avgLessThan50);
     scanner3.close();

     /*10. Write a program that asks the user for a positive nonzero integer value. 
     The program should use a loop to get the sum of all the integers from 1 up to the number entered.
      For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50. */
      Scanner scanner4 = new Scanner(System.in);
      System.out.println("Enter Positive number");
      int num3=scanner4.nextInt();
      int sum=0;
        if (num3<=0){
          System.out.println("Error input");
        }
        else{
          for(int i=1;i<=num3;i++)
          sum+=i;
          System.out.println("Sum = " + sum);
        }
        scanner4.close();
      
    }
}
