package week_10;

public class AbstractTask {
    public static void main(String[] args) {
    Triangle t1= new Triangle();
    t1.calculateArea();
    t1.calculatePerimeter();
    Rectangle r1 = new Rectangle();
    r1.calculateArea();
    r1.calculatePerimeter();
    Circle c1 = new Circle();
    c1.calculateArea();
    c1.calculatePerimeter();
    }
}
 /*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/ 

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
 }
 class Circle extends Shape{
     double radius = 6;
     @Override
     void calculateArea(){
       double  areaCircle=22/7*radius*radius;
       System.out.println("Area of Circle = " + areaCircle);
     }
     @Override
     void calculatePerimeter(){
         double perimeterCircle = 2*22/7*radius;
         System.out.println("Perimeter of Circle = "+ perimeterCircle);
     }
 }
 class Rectangle extends Shape{
     public double length = 10;
     public double breadth = 20;
     @Override
     void calculateArea(){
        double areaREctangle = length*breadth;
        System.out.println("Area of rectangle = " + areaREctangle);
     }
     @Override
     void calculatePerimeter(){
        double perimeterRectangle = 2* (length+breadth);
        System.out.println("Perimeter of rectangle  = " + perimeterRectangle);
     }
 }
 class Triangle extends Shape{
    public double base = 5;
    public double height = 6;
    public double s1 = 4;
    public double s2= 5;
    @Override
    void calculateArea(){
        double areaTriangle =(base* height)/2;
        System.out.println("Area of Triangle = "+areaTriangle);
    }
    @Override
    void calculatePerimeter(){
        double PerimeterTriangle = s1 + s2 + base;
        System.out.println("Perimeter of Triangle = " + PerimeterTriangle);
    }
 }