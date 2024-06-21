public class AccessModifier {
    public static void main(String[] args) {
        AccessExample ae= new AccessExample();
        ae.name = "Ram";
        ae.age = 12 ;
        // ae.salary =  1000.21;
        ae.defaultFunction();
        ae.publicFunction();
        // ae.privateFunction(); 
        ae.accessPrivate();
        ae.setSalary(1002.22);
        System.out.println(ae.getSalary());

        Dog dog1 = new Dog();
        dog1.breed = "Shephard";
        dog1.setName("Tom");
        dog1.setAge(12);
        System.out.println("Name : " +dog1.getName());
        System.out.println("Breed : " + dog1.breed);
        System.out.println("Age : " + dog1.getAge());
    }
}

/*Task
 * Make a class Dog
 * Make a private attribute name and age
 * Make a public attribute breed
 * Make setter for name and age
 * Make getter for name and age 
 * Make an object for Dog
 * Fill all attribute 
 * Print the following using object
 * Name : XYZ
 * Breed : ABC
 * Age : 10
 */
class Dog{
    private String name;
    private int age ;
    public String breed;

    void setName(String n ){
        name = n;
    }
    String getName(){
        return name;
    }
    void setAge(int a){
        age = a;
    }
    int getAge(){
        return age;
    }
}

class AccessExample{
    String name; // Automatically default, package/folder can access
    public int age ; // can be accessed anywhere
    private double salary ; // can only be accessed inside this class

    void setSalary(double s){
        salary = s ;
    }
    double getSalary(){
        return salary ;
    }
    // same concept in function
    void defaultFunction(){
        System.out.println("I can be accessed inside a package ");
    }
    public void publicFunction(){
        System.out.println("I can be accessed from anywhere");
    }
    private void privateFunction(){
        System.out.println("I can be accessed inside class");
    }
    void accessPrivate(){
        System.out.println(salary);
        privateFunction();
    }
}