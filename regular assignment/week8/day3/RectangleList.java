// Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.
import java.util.*;

class Rectangle {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getLength() {
    return length;
  }

  double getWidth() {
    return width;
  }

  double getArea() {
    return length * width;
  }
}
public class RectangleList{
  public static void main(String[] args) {
    ArrayList<Rectangle> rec = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++){
      System.out.println("enter the length and bredth of rectangle");
      rec.add(new Rectangle(sc.nextDouble(), sc.nextDouble()));
    }
    for (Rectangle rectangle : rec) {
      System.out.println("Length: " + rectangle.length);
      System.out.println("Width: " + rectangle.width);
      System.out.println("Area: " + rectangle.getArea());
    }
    for (Rectangle rectangle : rec) {
      if (rectangle.length == 2.5) {
         rec.remove(rec.indexOf(rectangle));
      }
    }
    for (Rectangle rectangle : rec) {
      System.out.println("length is " + rectangle.length + "\twidth is" + rectangle.width);
    }
  }
}