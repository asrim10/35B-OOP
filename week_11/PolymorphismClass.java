package week_11;

public class PolymorphismClass {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(10, 20, 50));
        System.out.println(mo.add(10.2, 10.3));
        mo.add();

        //Method Overriding
        Document d1 = new Document();
        d1.print("Black");
        //Polymorphism allow Child object to be stored in parent class variable
        Document d2 = new MsWord();
        d2.print("White");
        //Doing so will take the updated function and attribute from child object representation
        Document d3 = new Office365();
        d3.print("Yellow");
        //When Parent variable holds child object 
        //Only the attribute and function written in Parent can be used
        //EG: d3.online; -> Cannot be used
    }
    
}
/*Method Overloading - Compiletime polymorphism
 * Making same function multiple times with diff in parameter
 */
class MathOperation{
    int add (int num1 , int num2){
        return num1 + num2;
    }
    //1/ Changing the number of parameter
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    //2. Changing  the data type of parameter
    double add(double num1, double num2){
        return num1 + num2;
    } 
    /*Note: Method Overloading expects the unique in data type of parameter
     * Cannot overload method just ny changing the variable 
     * EG: int add(int a, int b) -> cannot do this as add 2 int already made
     * Cannot Overload by just changing return data type 
     * EG: double add(int num1, int num2) -> Cannot do this as add with 2 int already exists
     */
    void add(){
        System.out.println("Invalid Operation");
    }
}

// Method Overriding = Runtime polymorphism
// Making the same function of ParentClass in ChildClass
class Document{
    public void print(String paper){
        System.out.println("Document Printing.");
    }
}

//Method Overriding is only possible in ChildClass
class MsWord extends Document{
    boolean online = false;
    @Override
    public void print(String paper){
        System.out.println("MS Word is printing");
    }   
}

// Method Overriding can be done in Multi level inheritance
class Office365 extends MsWord{
    boolean online = true;
    @Override
    public void print(String paper){
        System.out.println("Online is printing");
    }   
}