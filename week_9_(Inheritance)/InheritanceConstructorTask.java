// Task
// Make a class Pant
// Add two attribute color and texture
// Make constructor or Pant that takes color and texture 
// Make a class HalfPant that extends Pant
// Make a attribute color and add default String White
// Make a non param constructor of HalfPant and \
// call the Parameterized constructor of parent Pant with "Black" and "Wool"
// Make a function design() in HalfPant that takes String color \
// change the parent color to current color of halfpant
// change the current color of half pant to provided parameter
public class InheritanceConstructorTask {
    public static void main(String[] args) {
        
    }
}
class Pant{
    String color;
    String texture;
    
    Pant(){
        System.out.println("Pant");
    }
    Pant(String color,String texture){
        this.color=color;
        this.texture=texture;
    }
}
class Halfpant extends Pant{
    String color;
    Halfpant(){
        super("Black","Wool");
        
    }
    void design(String color){
        super.color=this.color;
        this.color=color;
    }
}