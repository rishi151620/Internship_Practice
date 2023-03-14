// Create a class called "Car" with attributes like "make", "model", "year", and "color". Include a method that prints out the car's attributes.
import java.util.*;
class Car{
  String model,name,color;
  int year;

  Car(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the name of car");
    name=sc.next();
    System.out.println("enter the model");
    model=sc.next();
    System.out.println("enter the color of the car");
    color=sc.next();
    System.out.println("enter the year the car was launched ");
    year=sc.nextInt();

    carAttributes();
  }
  void carAttributes(){
    System.out.println("the car attributes are \n*********\n");
    System.out.println("name of the car is "+name);
    System.out.println("model of the car is "+model);
    System.out.println("color of the car is "+color);
    System.out.println("year the car was launched is "+year);
    System.out.println("/-/-/-/-/-/-/-\n");
  }
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    Car c=new Car();
    
  }
  
}