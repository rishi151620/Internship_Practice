// Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.
import java.util.*;
class Rectangle implements Comparable<Rectangle>{
  private int width;
  private int height;

  Rectangle(int width,int height){
    this.width=width;
    this.height=height;
  }
  public int getwidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
  public int getArea(){
    return (width*height);
  }
  public int getPeri(){
    return (2*(width+height));
  }
  public int compareTo(Rectangle r) {
       if(getPeri()>r.getPeri()){
         return -1;
       }
      else if(getPeri()<r.getPeri()){
        return 1;
      }
      else{
        return 0;
      }
  }
}
class AreaComparator implements Comparator<Rectangle>{
  public int compare(Rectangle r1, Rectangle r2) {
    if(r1.getArea()>r2.getArea()){
      return 1;
    }
    else if(r1.getArea()<r2.getArea()){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class RectangleComparator{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    ArrayList<Rectangle> rectangles=new ArrayList<Rectangle>();
    System.out.println("enter the width and heights for 3 rectangles :");
    for(int i=0;i<3;i++){
      rectangles.add(new Rectangle(sc.nextInt(),sc.nextInt()));
    }
    Collections.sort(rectangles,new AreaComparator());
    System.out.println("acsending order the area :");
    for(Rectangle r:rectangles){
      System.out.println(r.getwidth()+" "+r.getHeight()+" "+r.getArea());
    }
    Collections.sort(rectangles);
    System.out.println("decending order of the perimeter :");
    for(Rectangle r:rectangles){
      System.out.println(r.getwidth()+" "+r.getHeight()+" "+r.getPeri());
    }
    
  }
}