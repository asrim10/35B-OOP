public class FirstOop {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.name = "Ram";
        // p1.age = 12;
        // p1.gender = 'M';
        // System.out.println(p1.name);
        // // p1.introduction();

        // Person p2= new Person();
        // p2.name = "Asrim";
        // p2.age = 19;
        // p2.gender = 'M';
        // p2.introduction();

        // Square s1= new Square();
        // s1.sides = 10;
        // int s1Area = s1.area();
        // System.out.println(s1Area);
        // s1.addSides(2);
        // System.out.println(s1.area());

        // Rectangle r1 = new Rectangle();
        // r1.length = 2;
        // r1.breadth = 4;
        // double r1Area = r1.areaOfRectangle();
        // System.out.println(r1Area);
        // double r1perimeter = r1.perimeterOfRectangle();
        // System.out.println(r1perimeter);

        Car c1 = new Car();
        c1.name = "Lamborghini Urus";
        c1.brand = "Lamborghini";
        c1.year = 2017;
        c1.color = "Black";
        c1.start();
        c1.stop();
        c1.detail();


        Car c2 = new Car();
        c2.name = "Mustang 109";
        c2.brand = "Mustang";
        c2.year = 2024 ;
        c2.color = "Black and Red";
        c2.start();
        c2.modify("Green");
        c2.detail();

        Car c3 = new Car();
        c3.name = "Maruti Suzuki";
        c3.brand="Suzuki";
        c3.year = 1999 ;
        c3.color = "White";
        c3.start();
        c3.expiry();
        c3.detail();

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

//  class Rectangle{
//     double length , breadth;
//     double areaOfRectangle(){
//         double a = length * breadth;
//         return a;
//     }
//     double perimeterOfRectangle(){
//         double perimeter = 2*(length + breadth);
//         return perimeter;
//     }
//  }

 /*Task
    make attributes : name, brand, year, color
    make a function modify() that takes new color and set to old color
    make a function expiry() that returns 100 added to year
    make a function start() that prints (name is starting)
    make a function stop() that print (name, brand is stopping)
    make a function detail() that print ( name, brand, color and year)
    make 3 Object of Car
    Start all 3 object
    Stop only 1st object
    Modify 2nd car to Green color
    print the expiry of 3rd object
    print detail of all 3 object
    */

 class Car {
    String name;
    String brand;
    int year;
    String color;
        void modify(String new_color){
            color = new_color;
        }
        int expiry(){
            return year + 100;
        }
        void start(){
            System.out.println(name + " is starting");
        }
        void stop(){
            System.out.println(name +" , " +  brand + " is stopping");
        }
        void detail(){
            System.out.println("Name : " + name);
            System.out.println("Brand : "+ brand);
            System.out.println("Color : "+color);
            System.out.println("Year : "+ year);
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