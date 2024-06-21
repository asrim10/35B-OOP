public class Animals {
    public static void main(String[] args) {
        Labrador l = new Labrador();
        l.Name = "Herofish";
        l.breed = "American";
        l.country = "Nepal";
        l.color = "White Labrador";
        l.speaks();
        l.fur();
        l.barks();
        l.play();
    }
}
class Animal{
    public String Name;
    void speaks(){
        System.out.println(Name + " " + "Shouts");
    }
}
class mammals extends Animal{
    public String breed;
    void fur(){
        System.out.println(breed + " have furrr");
    }
}

class Reptile extends Animal{
    public int eggs;
    void sheds(){
        System.out.println(Name + " lays " + eggs + " " + "eggs");
    }
}
class dog extends mammals{
    String country;
    void barks(){
        System.out.println(Name + " "+ country + " barks");
    }
}
class cat extends mammals{
    String origin;
    void meows(){
        System.out.println(Name + " " + breed + " meows");
    }
}
class Amphibian extends Reptile{
    boolean Scale;
    void swims(){
        System.out.println(Name + " Swims");
    }
}
class Labrador extends dog{
    String color;
    void play(){
        System.out.println(color + " plays football");
    }
}
class GermanShepherd extends dog{
    boolean spot;
    void guard(){
        System.out.println("Guards Owner");
    }
}