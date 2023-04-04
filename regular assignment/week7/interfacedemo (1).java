// Create an interface Movable with two methods: moveUp() and moveDown(). Implement the interface in two classes Car and Bike, and create instances of both classes to test their moveUp() and moveDown() methods.
interface Movable{
  public void moveUp();
  public void moveDown();
}
class Car implements Movable{
  public void moveUp(){
    System.out.println("car moves up");
  }
  public void moveDown(){
    System.out.println("car move down");
  }
}
class Bike implements Movable{
  public void moveUp(){
    System.out.println("bike moves up");
  }
  public void moveDown(){
    System.out.println("bike move down");
  }
}
class interfacedemo{
  public static void main(String args[]){
    Car c=new Car();
    Bike b=new Bike();
    b.moveUp();
    b.moveDown();
    c.moveUp();
    c.moveDown();
  }
}
