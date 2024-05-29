package week_7;

public class FirstOop {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;
        p1.gender = 'M';
        System.out.println(p1.name);
        // p1.introduction();

        Person p2= new Person();
        p2.name = "Asrim";
        p2.age = 19;
        p2.gender = 'M';
        p2.introduction();

        Square s1= new Square();
        s1.sides = 10;
        int s1Area = s1.area();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area());

        Rectangle r1 = new Rectangle();
        r1.length = 2;
        r1.breadth = 4;
        double r1Area = r1.areaOfRectangle();
        System.out.println(r1Area);
        double r1perimeter = r1.perimeterOfRectangle();
        System.out.println(r1perimeter);
    }
}

/*
 * Task
 * make a class Rectangle
 * Make 2 attributes in double , length and breadth
 * make a function areaOfRectangle that returns length * breadth
 * make a function perimeterOfRectangle that returns 2(length + breadth)
 * make an object of Rectangle and print area and perimeter
 */

 class Rectangle{
    double length , breadth;
    double areaOfRectangle(){
        double a = length * breadth;
        return a;
    }
    double perimeterOfRectangle(){
        double perimeter = 2*(length + breadth);
        return perimeter;
    }
 }

class Square{
    int sides;
    int area(){
        int area = sides*sides;
        return area;
    }
    void addSides (int val){
        sides = sides + val; //sides will retain state/data
    }
}

class Person{
    // data/fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures/function/methods
    void introduction(){
        System.out.println("Hi my name is " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}