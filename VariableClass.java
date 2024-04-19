public class VariableClass {
    /*Instance variable
     * Access with object
     * Is not shared with other object
     */
    int instanceVariable=120;
    /*Static variable 
     * Access with Class
     * Is shared with other object
     */
    static int staticVariable=2000;
    public static void main(String[] args) {
        /*Non primitive data type */
        /*Declaration */
        byte bytevalue;
        /*Initialization */
        bytevalue=10;
        /*Declaration and initialization */
        short shortValue=100;
        /*Multiple Declaration */
        int intValue1, intValue2;
        /*Multiple initialization */
        intValue1=-99; intValue2=99;
        /*Multiple Declaration and Initialization */
        long longValue1=-999, longValue2=999;
        float floatValue=1.90f; //the letter 'f' is required
        double doubleValue=28.88d; //the letter 'd' is optional
        char charValue='C'; // single letter in single quote
        boolean boolValue=false; //true/false lowercase


        /* Non primitive Data type  */
        /*String */
        String stringInfo1="This is a Variable";
        /*Using class */
        String stringInfo2= new String("Class");
        /*Object use the same class as written above */
        VariableClass variableObj= new VariableClass();

        /* Illegal actions following */
        /*byte bytevalue =10; // you cannot redeclare */
        /*byteValue =20; //instead reassign */
        /*boolean boolVal3='false';// wrong data type
         short shortVAl=10000000; // cannot exceed min/max
         */
        /*we need to use object to access instance variable */
        System.out.println(variableObj.instanceVariable);
        /*We can access the static variable with class */
        System.out.println(VariableClass.staticVariable);

        /*Type casting */
        /*Implicit type casting (automatic ) 
         * From smaller type to larger type*/
        int intValueConvert=10;
        double intValueConvertTODouble= intValueConvert;
        /*Explicit type casting (manual)
         * From larger type to smaller type*/
        double doubleValueConvert=19.23d;
        int doubleValueConvertToInt=(int) doubleValue;
        
    }
}
