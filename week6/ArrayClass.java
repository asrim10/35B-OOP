public class ArrayClass {

    public static void main(String[] args) {
        /*Array declaration */
        int[] myFristArray;
        /*Memory Allocation */
        myFristArray= new int [5];
        /*Array Declaration and memory alloc*/
        int [] mySecondArray= new int [3];
        /*Array declaration, Memory Alloc and initialization */
        int[] myThirdArray = {10 , 20 , 30 , 40};

        //Array index -> Position of the element/values
        //Starts with zero
        mySecondArray[0]=10;
        mySecondArray[1]=20;
        mySecondArray[2]=100;

        // Access/Store in new Variable
        int arrayElement = mySecondArray[0];
        System.out.println("First index " + arrayElement);
        System.out.println("Second index " + mySecondArray[1]);


        /*Task 1 
         * Make the following array named animals
         * ["Cat" , "Dog" , "Tiger" , "Snake"]
         * Print "Snake"
        */
        String[] animals = {"Cat" , "Dog" , "Tiger" , "Snake"};
        System.out.println(animals[3]);    
    }
}
