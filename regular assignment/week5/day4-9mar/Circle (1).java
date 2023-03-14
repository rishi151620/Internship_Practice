// Create a class called "Circle" with instance variables for radius and diameter. Add a parameterized constructor that takes radius as a parameter and calculates the diameter, and add a method to calculate the area.
import java.util.*;
class Circle{
  int radius;
  int diameter;
  double area;

  Circle(int r){
    radius=r;
    
  }
  void display(){
    System.out.println("diameter="+(2*radius));
    System.out.println("area="+(3.14*radius*radius));
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the radius :");
    int r =sc.nextInt();
    Circle c = new Circle(r);
    c.display();
    
  }
  
}