// Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.
import java.util.*;
class Shape1{
  double get_area(){
    return 0.0;
  }
}
class Circle extends Shape1{
  double get_area(){
    double r=5;
    double area=(3.14*r*r);
    return area;
  }
}
class Rectangle extends Shape1{
  double get_area(){
    double l=5.6,b=43.2;
    return (l*b);
  }
}
public class ShapeNew{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Circle c =new Circle();
    System.out.println("area of circle is :"+c.get_area());
    Rectangle r=new Rectangle();
    System.out.println("area of rectangle is :"+r.get_area());
  }
}