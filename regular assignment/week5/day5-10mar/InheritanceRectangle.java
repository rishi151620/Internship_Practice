// Create a class called Shape with attributes color and filled. Create a subclass called Rectangle that inherits from Shape and adds attributes width and height. Create a method in Rectangle called get_area() that returns the area of the rectangle.
class Shape{
  String color;
  
}

class Rectangle extends Shape{
  int width;
  int height;

  int get_area(){
    return (width*height);
  }


}
public class InheritanceRectangle{
  public static void main(String args[]){
    Rectangle r=new Rectangle();
    r.color="red";
    r.width=3;
    r.height=5;
    System.out.println("area of rectangle is : "+r.get_area());
  }
}