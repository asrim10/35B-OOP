public class StaticFunction {
    public static int multiply(int a , int b){
        int multiplication= a * b;
        return multiplication;
    }
    public static String vendingMachine(int menu){
        if (menu == 1){
            return "coke";
        }
        if (menu==2) {
            return "Water";
        }
        if (menu == 3) {
            return "Frooti";
        }
        return "Invalid Menu";
    }  
    /*Task1
     * create a function checkEligible
     * take 2 parameter, String name, int age
     * returns String
     * if age is less than 0 , more than 200 return "Hello name, Invalid age"
     * if age less than 18 return "Sorry name , you are not eligible"
     * else return  "Congratulation name , You are eligible"
     */
    public static String checkEligible(String name , int age){
        if (age<0 || age>200){
            return "Hello " + name + ",Invalid age";
        }
        else if (age<18) {
            return "Sorry " + name + ",you are not eligible";
        }
        else {
            return "Congratulation " + name + ",you are eligible";
        }
    }

     /*Task 2 
      * Create a function makeSquare that takes double 
      return double of square Value
      */
    public static double makeSquare(double Value){
        return Value*Value;
    }

    public static void main(String[] args) {
    /*if the function is static and in same class
     * no need to make object simply call
     */
    int multiplyReturn= multiply(10, 2);
    System.out.println("Result = " + multiplyReturn);
    String iGet = vendingMachine(1);
    System.out.println("I get " + iGet);
    System.out.println(checkEligible("Asrim",201));
    System.out.println(makeSquare(9));
    }    
}
