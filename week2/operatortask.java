package week2;
public class operatortask {
    public static void main(String[] args) {
        /*task 1
         * Write a program to print whether a variable is greater or equal to 18
         */

         int gNum1= 50 , gNum2 = 18;
         System.out.println("Greater than 18 " +(gNum1==gNum2));

         /*task 2 
          * WAP to print simple interest from variables
          Mark 3 variable for amount, time and rate and save the calculation into 
          Fromula si = amount * time * rate/100; //use float/double 
          */

          int amount= 10000;
          int time = 2;
          float rate = 2.5f;
          float si=(amount* time * rate)/100;
          System.out.println("Simple interest is "+ si);


        /* task 3
         * WAP to print the area and perimeter of rectangle 
         * area = length*breadth
         * perimeter = 2 (length+breadth)
         */

         int l = 20;
         int b = 10;
         float area = l*b;
         float perimeter= 2*(l+b);
         System.out.println("Area of rectangle is: " + area);
         System.out.println("Perimeter of rectangle is: " + perimeter);

         /* task 4 
          * complete the task 1 using ternary operator
          */

          int tNum1= 50 , tNum2=50;
          String output;
          output = tNum1 == tNum2 ? "True Statement" : "False Satement";
          System.out.println(output); 
    }
    
}
