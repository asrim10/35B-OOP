public class FunctionClass {
    /*Function are made inside a class scope
     * above or below main not inside*/
    void printsomething(){
        System.out.println("This function prints");
    }
    /*With return type */
    int returnInt(){
        int value = 10;
        return value;
    }
    double addValue(int num1, double num2){
        double sum=num1+num2;
        return sum;
    }

    /*Make a funcion  isEqual
    that takes two double value and returns boolean
    return if the value are equal or not */
    boolean isEqual(double a ,double b){
      boolean equal = a == b;
      return equal;
    }
    
    public static void main(String[] args) {
        /*TO call a normal/non static function we need to create object 
         * just remember the syntax for now*/
        FunctionClass fc=new FunctionClass();
        /*Call function from object of FunctionClass */
        fc.printsomething();
        /*Can call multiple times */
        fc.printsomething();
        int returnFromFunction = fc.returnInt();
        System.out.println("Return from function is " + returnFromFunction);
        double retrunfromAdd=fc.addValue(10, 20.2);
        System.out.println("Add returns " + retrunfromAdd);
        boolean returnFromequal=fc.isEqual(10, 10);
        System.out.println(returnFromequal);
    
    }
}
