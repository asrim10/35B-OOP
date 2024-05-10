import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
    /*1. Write a JAVA program to find the maximum between three numbers. */
    int a=10;
    int b=20;
    int c=5;
    if (a>b && a>c) {
        System.out.println("a is the maximum");
    }
    else if (b>a && b>c) {
        System.out.println("b is the maximum");
    }
    else{
        System.out.println("c is the maximum");
    }

    /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */
    int i=-1;
    if (i>0) {
        System.out.println("Positive");
    }
    else if (i<0) {
        System.out.println("Negative");
    }
    else{
        System.out.println("Zero");
    }

    /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
    int num1=55;
    if (num1%5==0 && num1%11==0) {
        System.out.println("The number is divisible by 5 and 11");
    }
    else{
        System.out.println("The number is not divisible by 5 and 11");
    }

    /*4. Write a JAVA program to check whether a number is even or odd. */
    int num2=99;
    if (num2%2==0) {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }

    /*5. Write a JAVA program to check whether a year is a leap year or not. 
    Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
    int year=201;
    if (year%4==0) {
        if (year%100!=0 || year%400==0) {
            System.out.println("Leap year");
        }
    }
    else{
        System.out.println("Not leap year");
    }

    /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
    Scanner alpha=new Scanner(System.in);
    System.out.println("Enter an alphabet");
    char a1=alpha.next().charAt(0);
    if (a1=='a' || a1=='e'|| a1=='i' || a1=='o' || a1=='u') {
        System.out.println("Alphabet is Vowel");
    }
    else{
        System.out.println("Alphabet is not Vowel");
    }
    alpha.close();


/*Switch Case */
    /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and 
    converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your grade (A,B,C,D or F)");
    char grade=scan.next().charAt(0);
    double gpa;
    grade=Character.toUpperCase(grade);
    switch (grade) {
        case 'A':
            gpa=4.0;
            break;
        case 'B':
            gpa=3.0;
            break;
        case 'C':
            gpa=2.0;
            break;
        case 'D':
            gpa=1.0;
            break;
        case 'F':
            gpa=0.0;
            break;
        default:
        System.out.println("Invalid grade");
        return;       
    }
    System.out.println("THe corresponding GPA is " + gpa);
    

    /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
    and performs the corresponding arithmetic operation using a switch case statement. */
    Scanner num3= new Scanner(System.in);
    System.out.println("Enter first number");
    int no1=num3.nextInt();
    System.out.println("Enter Second Number");
    int no2=num3.nextInt();
    System.out.println("Enter the operator(+, -, *, /)");
    char operator=num3.next().charAt(0);
    double result;

    switch (operator) {
        case '+':
            result = no1 + no2;
            break;
        case '-':
            result = no1 - no2;
            break;
        case '*':
            result = no1 * no2;
            break;
        case '/':
            if (no2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
            result = no1 / no2;
            break;
        default:
        System.out.println("Invalid operator");
            return;
    }
    System.out.println("Result = " +result);
    

    /*3. Write a Java program that takes an integer input (1 to 12) representing a month 
    and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
    Scanner scan1= new Scanner(System.in);
    System.out.println("Enter number(1 to 12)");
    int num4=scan1.nextInt();
    switch (num4) {
        case 1,2,3:
            System.out.println("winter");
            break;
        case 4,5,6:
            System.out.println("Spring");
            break;
        case 7,8,9:
            System.out.println("Summer");
            break;
        case 10,11,12:
            System.out.println("Fall");
            break;
        default:
            System.out.println("Invalid month");
            break;
    }
    scan1.close();

    /*4. Implement a Java program that calculates the area of different shapes 
    (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
    
    Scanner scanner1 = new Scanner(System.in);
        
    System.out.println("Choose a shape:");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    System.out.println("3. Square");
    System.out.println("4. Triangle");
    
    int choice = scanner1.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Enter Radius");
            double radius=scanner1.nextDouble();
            double circleArea=Math.PI*radius*radius;
            System.out.println("Area of circle = " +circleArea);   
            break;
        case 2:
            System.out.println("Enter Length and Breadth of rectangle");
            double l1=scanner1.nextDouble();
            double b1=scanner1.nextDouble();
            double recArea= l1*b1;
            System.out.println("Area of rectangle = " + recArea);
            break;
        case 3:
            System.out.println("Enter length of square");
            double l2=scanner1.nextDouble();
            double squareArea= l2*l2;
            System.out.println("Area of Square = " + squareArea);
            break;
        case 4:
            System.out.println("Enter base and height of triangle");
            double b2=scanner1.nextDouble();
            double h1=scanner1.nextDouble();
            double triArea= 0.5*b2*h1;
            System.out.println("Area of triangle = " +triArea);
            break;

        default:
            System.out.println("Invalid shape");
            break;
    }
    scanner1.close();
    }
}


