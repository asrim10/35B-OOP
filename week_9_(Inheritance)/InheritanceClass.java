public class InheritanceClass {
    public static void main(String[] args) {
    Childclass cc = new Childclass();
    cc.Firstname = "XYZ";
    cc.lastname = "ANC";
    cc.expenses = 1000.11;
    // cc.Salary = 10000;  //
    cc.info();
    cc.detail();
    }
}


class ParentClass{
    public String lastname;
    private int Salary;
    protected double expenses;

    void info(){
        System.out.println("Parent Function " + lastname);
    }
}
/*To use Inheritance use the keyword "extends"
Single level inheritance, one parent/super - one child/sub*/
class Childclass extends ParentClass{
    String Firstname;
    void detail (){
        System.out.println(Firstname + " " + lastname);
    }
}

// Multi level inheritance, nested class, child class has another child class

class GrandChild extends Childclass{
    String middlename;
    void description(){
        System.out.println(Firstname + " " + middlename + " " + lastname);
    }
}
// tree / heirarical inheritance 
// one parent, multiple children
class BrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println(lastname + " " + address);
    }
}

