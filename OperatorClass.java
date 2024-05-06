public class OperatorClass {
    public static void main(String[] args) {
        /*Arithmetic operators */
        int aNum1=10 , aNum2=20;
        int sum=aNum1+aNum2; //"+" is an arithmetic operator
        System.out.println("Addition is "+sum);
        System.out.println("Substraction is "+(aNum1-aNum2));
        System.out.println("Multiplication is "+ (aNum1*aNum2));
        System.out.println("Division is "+ (aNum1/aNum2));
        System.out.println("Modulo is "+ (aNum1%aNum2));

        /*Assignment operator */
        int asNum1=20; // = is used to assign a value to variable
        asNum1+=1;// same as asNUm1 = asNum1+1;
        System.out.println("+= value is "+ asNum1);
        System.out.println("-= value is "+ (asNum1-=10));
        System.out.println("*= value is "+ (asNum1 *=10));
        System.out.println("/= value is "+ (asNum1/=2));
        System.out.println("%= value is "+ (asNum1%=3));

        /*Relational Operator */
        int rNum1=20 , rNum2= 21;
        boolean rExpression= rNum1==rNum2; //returns true/false
        System.out.println("Equals to " + rExpression);
        System.out.println("Greater than" + (rNum1>rNum2));
        System.out.println("Less than" + (rNum1<rNum2));
        System.out.println("Not equals to"+ (rNum1!=rNum2));
        System.out.println("Greater tha equals to " + (rNum1 >= rNum2));

        /*Logical operators */
        int lNum1=20 , lNUm2=20;
        boolean lExpression1 = lNum1 == lNUm2;
        boolean lExpression2 = lNUm2 > lNUm2;
        System.out.println("&& is used for AND" + (lExpression1 && lExpression2));
        System.out.println("|| is used for OR" + (lExpression1 || lExpression2));
        System.out.println(" is used for NOT" + (!lExpression1));

        /*Unary Operators */
        int uNum1 = 10;
        uNum1++; //uNum = uNum1 +1; //changes value next line
        ++uNum1; // changes value in this same line
        System.out.println("--uNum1 unary is "+ --uNum1);
        System.out.println("uNUm1-- unary is " + uNum1--);

        /*Ternary Operatoer */
        int tNum1 = 20, tNum2 = 10;
        String output;
        /*take following if else as example
        if (tNum1 > tNUm2){
            output ="True Statement"
        } else{
            output = "False Statement";
        }
        */ 
        output = tNum1 > tNum2 ? "True Statement" : "False Satement";
        /*Here tenary operator contains expression 
         * if expression is true it returns after the "?"
         * if the expression is false it returns after the ":"
         */
        int intOutput= tNum2 == tNum1 ? -10 :10;
        System.out.println(output);
        System.out.println(intOutput);

    }
}
