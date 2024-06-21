package week_10;
public class AbstractClass {
    public static void main(String[] args) {
    Samsung s1 = new Samsung();
    s1.sms();
    s1.call("9820456790");
    Apple a1 = new Apple();
    a1.sms();
    a1.call("9841994605");
    }
    
}
//to make abstract class keyword "abstract" before "class"
//if you make abstract class, cannot make object of it
abstract class SmartPhone{
    //abstract class may or may not contain abstract functions
    //to make abstract function use"abstract" before making function
    //abstract class do not have a body
    abstract void sms();
    abstract public boolean call(String number);
    //abstract class can have normal functions
    void imei(){
        System.out.println("imei number");
    }
}
//abstract class can only be used in sub/child class
class Samsung extends SmartPhone{
    //when extending abstract class we have to implement/override
    //all the abstract function of abstract class
    @Override
    void sms(){
        System.out.println("Samsung way of sending sms");
    }
    @Override
    public boolean call(String number){

        System.out.println("Samsung calling to "+number);
        return true;
    }
}

/*Make a class Apple extendiing Smartphone
 * Make object of Samsung and Apple,
 * call sms() and call() function of them
 */

 class Apple extends SmartPhone {
    @Override
    void sms(){
        System.out.println("Apple way of sending sms");
    }
    @Override
    public boolean call(String number){

        System.out.println("Apple calling to "+number);
        return true;
    }
 }
