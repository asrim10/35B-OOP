package week12;

public class ExceptionHandTask {
        //  // Task
        // // Find the exception and use try catch block finally accordingly
        // int number1 = 10;
        // int number2 = number1 - 10;
        // int number3 = number1 / number2;
        // String name;
        // System.out.println(name.length());
        // String[] names = new String[100];
        // names[0] = "Ram";
        // names[110] = "Shyam";
        // //  Task end 
        public static void main(String[] args) {
        try {
            int number1 = 10;
            int number2 = number1 - 10;
            int number3 = number1 / number2; // This will throw ArithmeticException (division by zero)
            String name = null;
            System.out.println(name.length()); // This will throw NullPointerException
            String[] names = new String[100];
            names[0] = "Ram";
            names[110] = "Shyam"; // This will throw ArrayIndexOutOfBoundsException
              } catch (ArithmeticException e) {
                   System.out.println("Division by zero.");
              } catch (NullPointerException e) {
                   System.out.println("Null ayo");
              } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Array is not long enough");
              } finally {
                   System.out.println("This block always executes.");
              }
        }
}
        

