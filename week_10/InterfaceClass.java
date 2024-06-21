package week_10;
public class InterfaceClass {
    public static void main(String[] args) {
        
    }
}
// interface is made as same as class replacing with "interface"
// interface cannot be made object of
interface AnimalDo{
   public void move();
   public boolean eat (String food);
   // functions of interface is automatically public and abstract
}
// interface can extend another interface
interface MammalDo extends AnimalDo{
    public int legs();
}

// can be extended into multiple layer
interface DogDo extends MammalDo{
    public void bark();
}
class Husky implements DogDo{
    //when implenting interface that extends another interface
    //must overide all the function made on top of it
    @Override
    public void bark(){
        System.out.println("BOW WOW");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void move(){
        System.out.println("Husky moves fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Husky eat fish");
        return false;
    }
}

// "implements" keyword to use interface
class Wolf implements AnimalDo{
    // when implementing interface, all the function should be overridden
    @Override
    public void move(){
        System.out.println("would move fast");
    }
    @Override
    public boolean eat (String food){
        System.out.println("wolf eat meat");
        return false;
    }
}
class cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println(" cow move slow ");


    }
    @Override
    public boolean eat(String food){
        System.out.println("cow eat grass");
        return true;
    }
}