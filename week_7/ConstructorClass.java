public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("After Object");

        ParamConstructor pc = new ParamConstructor(10, 20);
        System.out.println(pc.data2);

        Cat cat1= new Cat("Billa" , 12);
        cat1.breed = "Sher";
        cat1.color = "Black";
        cat1.setAge(cat1.getAge()+1);
        System.out.println("Name : " + cat1.getName());
        System.out.println("Age : " + cat1.getAge());
        System.out.println("Breed : " + cat1.breed);
        System.out.println("Color : " + cat1.color);
    }
}
/*Task
 * Make a class cat
 * Make 2 private attribute name , age
 * Make 2 public attribute breed , color
 * Make a constructor to only set name and age
 * Make getter for name and age
 * Make a setter for age
 * Make an object of cat
 * FIll the attributes
 * Add +1 to the current age 
 * Print the following using object
 * Name : NY
 * age : 4
 * Breeed : xy
 * Color : Orange
 */
class Cat {
    private  String name;
    private int age;
    public String breed;
    public String color;
    
    Cat(String name , int age){
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge(){
        return age;
    }
    void setAge(int a){
        this.age = a;
    }
}
class ParamConstructor{
    private int data1 ;
    public int data2 ;

    void setData1(int data1){
        this.data1 = data1;
    }
    int getData1(){
        return data1 ;
    }
    ParamConstructor(int d1 , int d2){
        this.data1 = d1;
        this.data2 = d2;
    }
    
}
class ConstructorExample{
    // Non parameterized constructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        // Add more logic
        // Only called once, to set attributes value in most cases
    }
}