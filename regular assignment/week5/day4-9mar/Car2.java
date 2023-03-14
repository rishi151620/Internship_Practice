// Create a class called "Car" with instance variables for make, model, and year. Add a constructor that takes all three variables as parameters and sets the values.
import java.util.Scanner;
class Car2{
  String name,model,color;
  int year;
  Car2(String s,String y,String x,int a){
    Scanner sc = new Scanner(System.in);
    name=s;
    model=y;
    color=x;
    year=a;
    System.out.println("------------");
  }

  void carAttributes(){
    System.out.println("the car attributes are \n*********\n ");
    System.out.println("the name of the car is :"+name);
    System.out.println("the model of the car is :"+model);
    System.out.println("the color of the car is :"+color);
    System.out.println("the car launched in the year :"+year);
    System.out.println("/-/-/-/-/-/-/-/ \n");
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name of the car ");
    String r = sc.next();
    System.out.println("enter the model of the car ");
    String m = sc.next();
    System.out.println("enter the color of the car ");
    String n = sc.next();
    System.out.println("enter the year car was launched ");
    int q = sc.nextInt();
    Car2 c=new Car2(r,m,n,q);
    c.carAttributes();
  }
}