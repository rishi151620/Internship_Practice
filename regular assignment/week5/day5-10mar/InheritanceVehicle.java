// Create a class called Vehicle with attributes make, model, and year. Create a subclass called Car that inherits from Vehicle and adds attributes color and num_doors. Create a method in Car called get_info() that prints out the make, model, year, color, and number of doors of the car.
class Vehicle{
  String make;
  String model;
  int year;
  
}
class Car extends Vehicle{
  String color;
  int num_door;

  void print(){
    System.out.println("car information");
    System.out.println("***************");
    System.out.println("make: "+make+"\nmodel: "+model+"\nyear: "+year+"\nnumber of dorrs: "+num_door);
  }
}
public class InheritanceVehicle{
  public static void main(String args[]){
    Car c=new Car();
    c.make="vintage";
    c.color="black";
    c.model="m12";
    c.year=1970;
    c.num_door=4;
    c.print();
  }
}