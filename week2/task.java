import java.util.*;
public class task {
    public static void main(String[] args) {
        /*1. Write a program to check whether a person can cast a vote or not.
         The condition is you must be over 18 years old to vote. */
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter your age");
         int age=scan.nextInt();
         if (age>18) {
            System.out.println("yo are eligible for vote");
         }
         else{
            System.out.println("you are not eligible for vote");
         }
         scan.close();
        

         /*2. Write a program to calculate SI. */
         int P=1000;
         int T=3;
         float R=4.5f;
         System.out.println("Simple interest = " +(P*T*R)/100);

        /*3. Write a program to calculate, 
        area of the triangle, and 
        the Volume of the Cube and Cuboid. */
        /*Area of triangle */
        int base=10;
        int h=20;
        float areaa=(base*h)*1/2;
        System.out.println("Area of tringle = " + areaa);
        
        
        /*Volume of cuboid */
        int lenn=20;
        float heigh=10.5f;
        float bread=12;
        float Vol=lenn*heigh*bread;
        System.out.println("Volme of cuboid = " +Vol);
       
        
        /*Volume of cube */
        int s=5;
        System.out.println("Volume of Cube = " + s*s*s);


        /*4. Write the ternary operator for question no. 1 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int agee = scanner.nextInt();

        String canVote = (agee >= 18) ? "You can vote!" : "You cannot vote yet.";
        System.out.println(canVote);
        scanner.close();

        // /*5. Write a program to take two integer inputs from the user 
        // and print the sum and product of them. */
        Scanner number= new Scanner(System.in);
        System.out.println("Enter first number");
        int first=number.nextInt();
        System.out.println("Enter second number");
        int second=number.nextInt();
        int sum = first+second;
        int product = first*second;
        System.out.println("The sum of given numbers = " + sum);
        System.out.println("Product of given numbers = " + product);
        number.close();
        

        // /*6. Take two integer inputs from the user. 
        // First, calculate the sum of two, then the product of two. 
        // Finally, calculate the division of the thus obtained sum and 
        // product and print the result. */
        
        Scanner int1= new Scanner(System.in);
        Scanner int2= new Scanner(System.in);
        System.out.println("Enter first integer");
        int a=int1.nextInt();
        System.out.println("Enter Second integer");
        int b=int2.nextInt();
        int sum1=a+b;
        int prod=a*b;
        float div=sum1/prod;
        System.out.println("Division of sum and product = " + div);
        int1.close();
        int2.close();


        /*7. Take the name, roll number, and field of interest from the user and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner man=new Scanner(System.in);
        System.out.println("Enter your name");
        String n=man.nextLine();
        System.out.println("Enter your Roll number");
        int q=man.nextInt();
        System.out.println("Enter your field of interest");
        String i=man.nextLine();
        System.out.println("Hey, my name is "+ n +" and " + "my roll number is " + q +"." + "My field of interest is " + i);
        man.close();


        /*8. Take side of a square from user and print area and perimeter of it.
         Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
         Take the attributes as user input. */

         /*Area and perimeter of square */
         Scanner square= new Scanner(System.in);
         System.out.println("Enter side of square");
         int side=square.nextInt();
         float area=side*side;
         float perimeter=4*side;
         System.out.println("Area of suqare = " + area);
         System.out.println("Perimeter of square = " + perimeter);
         square.close();

         /*Simple interest */
         Scanner interest=new Scanner(System.in);
         System.out.println("Enter Principle");
         int Principle=interest.nextInt();
         System.out.println("Enter Time");
         int Time=interest.nextInt();
         System.out.println("Enter Rate");
         float Rate=interest.nextFloat();

         System.out.println("Simple interest = " +Principle*Time*Rate/100);
         interest.close();
        
         /*Volume of cuboid */
         Scanner cuboid=new Scanner(System.in);
         System.out.println("Enter length of cuboid");
         int l=cuboid.nextInt();
         System.out.println("Enter width of cuboid");
         int w=cuboid.nextInt();
         System.out.println("Enter height of cuboid");
         int H=cuboid.nextInt();
         int Volume=l*w*H;
         System.out.println("Volme of cuboid = " +Volume);
         cuboid.close();
         /*Area of triangle */
        Scanner triangle=new Scanner(System.in);
        System.out.println("Enter Base of triangle");
        int ba=triangle.nextInt();
        System.out.println("Enter height of triangle");
        int h1=triangle.nextInt();
        float A=(ba*h1)*1/2;
        System.out.println("Area of tringle = " + A);
        triangle.close();
        
        /*Volume of cube */
        Scanner L=new Scanner(System.in);
        System.out.println("Enter side of cube");
        int s1=L.nextInt();
        System.out.println("Volume of Cube = " + s1*s1*s1);
        L.close();

        /*9.  Ask user to give two double input for length and breadth of a rectangle 
        and print area type casted to int. */
        Scanner scanners = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanners.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanners.nextDouble();
        double area1= length * breadth;
        int areaInt = (int) area1;
        System.out.println("Area of the rectangle (type casted to int): " + areaInt);
        scanners.close();

        /*10. Write a program to calculate the total marks of four subjects of a student a
        nd the total percentage secured. 
        And use the following conditions to generate the final result;
    a. If equal to or more than 70 -> First Class
    b . If more than 59 -> Upper Second Class
    c. If more than 49 -> Second class
    d. If more than 39 -> Third class and if below than 40 the result is fail.  */
    Scanner marks=new Scanner(System.in);
    System.out.println("Enter marks of Maths");
    int math=marks.nextInt();
    System.out.println("Enter marks of science");
    int science=marks.nextInt();
    System.out.println("Enter marks of English");
    int english=marks.nextInt();
    System.out.println("Enter marks of Nepali ");
    int nepali=marks.nextInt();
    int obtained=math+science+english+nepali;
    int total=400;
    float percentage=(obtained/(float)total)*100;
    
    if (percentage>=70 ) {
        System.out.println("First Class");
    }
    else if(percentage>59 && percentage<=59){
        System.out.println("Upper Second Class");
    }
    else if(percentage>49){
        System.out.println("Second class");
    }
    else if(percentage>39){
        System.out.println("Third class");
    }
    else if (percentage<40){
        System.out.println("Fail");
    }
    else if (percentage>100 && percentage<0){
        System.out.println("Invalid");
    }
    else{
        System.out.println("Default");
    }
    marks.close();
    }

}