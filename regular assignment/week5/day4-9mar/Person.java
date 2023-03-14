// Create a class called "Person" with instance variables for name, age, and address. Add a parameterized constructor that takes name and age as parameters, and initializes the address to a default value.
import java.util.*;
class Person{
  String name;
  int age;
  String address;
  Person(String x,int y){
    name =x;
    age=y;
  }
  Person(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the address");
    address = sc.nextLine();
  }
  void display(){
    System.out.println("The name of the person "+name);
    System.out.println("The persons age is "+age);
   }
  void display1(){
    System.out.println("The persons address is :"+address);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the persons information :");
    Person ab[] = new Person[2];
    Person ab1[] = new Person[2];
    for(int i=0;i<2;i++){
      System.out.println("Enter the person "+(i+1)+" detail");
      System.out.println("Enter the name :");
      String q = sc.next();
      System.out.println("Enter the age :");
      int w = sc.nextInt();
      ab[i]=new Person(q,w);
      ab1[i]=new Person();
     }
     System.out.println("personal information of a person is given below\n********\n");
    for(int i=0;i<2;i++){
      ab[i].display();
      ab1[i].display1();
    }
  }
}