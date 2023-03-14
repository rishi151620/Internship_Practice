// Create a class called "Invoice" with instance variables for customer name, product name, and total price. Add a constructor that takes customer name, product name, and price as parameters, and calculates the total price based on the quantity. 
import java.util.*;
class Invoice{
  String coustomerName;
  String ProductName;
  int price;
  Invoice(String x,String y,int z){
    coustomerName =x;
    ProductName = y;
    price = z;
  }
  
  void display(){
    System.out.println("coustomer name"+coustomerName);
    System.out.println("Product name "+ProductName);
    System.out.println("The price is "+price);
  }
   void totalPrice(){
     System.out.println("The total price based on the quantity given below:");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity :");
    int n = sc.nextInt();
    int total;
    total = price*n;
     System.out.println("The total price is "+total);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Invoice  Information :");
    Invoice ab[] = new Invoice[2];
    for(int i=0;i<2;i++){
      System.out.println("Enter the "+(i+1)+" detail");
      System.out.println("Enter coustemer name  :");
      String q = sc.next();
      System.out.println("Enter the Product  name  :");
      String w = sc.next();
      System.out.println("Enter the price   :");
      int m = sc.nextInt();
      ab[i]= new Invoice(q,w,m);
      ab[i].display();
      ab[i].totalPrice();
    }
  }
}