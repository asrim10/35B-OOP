public class InheritanceConstructor {
    public static void main(String[] args) {
            Polo p1 = new Polo();
            p1.differentColor("Yellow");
            Polo p2 = new Polo("Red");
            Polo p3 = new Polo(10);
            Polo p4 = new Polo("Blue","Soft");
            // Call constructor with overloaded parameter

    }
}

class Shirt{
    String color = "Black"; // super.color
    Shirt(){
        System.out.println("Making Shirt");
    }
    Shirt(String color){
        this.color  = color;
    }
}

class Polo extends Shirt{
    String color = "White"; // this.color
    String texture;
    Polo(){
        // By default the constructor of parent is called
        // meaning super() or Shirt() on first line of execution
        super("White");
        System.out.println("Making Polo shirt");
    }
    // Constructor OverLoading
    // Same name function/ Constructor with different logic/param
    Polo(String color){
        this.color = color;
        System.out.println("Constructor with one string");
    }
    Polo(String color, String texture){
        this.color = color;
        this.texture = texture;
        System.out.println("Constructor with two string");
    }
    Polo(int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
    }
    // Note that constructor overload takes the difference in data type
    // not the variable Polo(String c) cannot be made
    void differentColor(String color){
        System.out.println("Param color "+ color);
        System.out.println("Class color "+ this.color);
        System.out.println("Parent color "+super.color);
    }
}

// Task
// Make a class Pant

class Pant{
    // Add two attribute color and texture
    String color;
    String texture;
    // Make constructor of Pant that takes color and texture
    Pant(String color, String texture){
        this.color = color;
        this.texture = texture;
    }
}

 // Make a class HalfPant that extends Pant
class HalfPant extends Pant{
    // Make an attribute color and add default String White
    String color = "White";
    // Make a non param constructor of HalfPant
    HalfPant(){
        // Call the parameterized constructor of parent Pant with "Black" and "Wool"
        super("Black", "Wool");
    }
    // // Make a function design() in HalfPant that takes String color 
    void design(String color) {
        // change the parent color to current color of halfpant
        super.color = this.color;
        // change the current color of half pant to provided parameter 
        this.color = color;
    }

}    
