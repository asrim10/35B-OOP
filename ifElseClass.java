public class ifElseClass {
    public static void main(String[] args) {
        /* If statement */
        if(true){
            System.out.println("True Statement");
        }
        /*If takes boolean expression inside() */
        int num1 = 10, num2 = 20 ;
        if (num1==num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        /*Note that else is optional */
        /*if else if */
        if (num1==num2){
            System.out.println("Equal");
        }
        else if (num1<num2){
            System.out.println("lesser");
        }
        else{
            System.out.println("Greater");
        }
        
        /*Note that else should be at last */
        /*If else if ladder */
        if (num1 > num2){
            System.out.println("Greater");
        }
        else if (num1 !=num2){
            System.out.println("Not equal");
        }
        else if(num1 == num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Default statement");
        }

        /*Nested if statement */

        if (num1 < 0){
            if (num1 > num2) {
                System.out.println("Negative and greater");
            }
            else{
                System.out.println("Negative and lesser");
            }
        }else{
            if (num1>num2) {
                System.out.println("Positive and Greater");
            }
            else{
                System.out.println("Positive and lesser");
            }
        }

        /*Task 
         * Consider the following marking
         * calculate the total and avg in a variable
         * if any of the marking is less than 35, print fail
         * if avg is less than 60 , print third div
         * if avg is less than 70, print second div
         * if avg is less than 80 print first div
         * if avg is greater than 80, print distinction
         * if avg is less than 0 or more than 100, print invalid
        */
        int science=35, english= 55, math =89;
        int total= science+english+math;
        System.out.println(total);
        int a=(science+english+math)/3;

        if(a<60){
            System.out.println("Third div");
        }
        else if (a<70){
            System.out.println("Second div");
        }
        else if (a<80){
            System.out.println("First div");
        }    
        else if (a>80){
            System.out.println("Distinction");
        }
        else if (a<0 || a>100){
            System.out.println("Invalid");
        }
        else {
            System.out.println("Default");
        }        
}
}
