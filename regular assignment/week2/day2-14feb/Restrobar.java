import java.util.*;
class Restrobar{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the table details:");
    System.out.print("total food cost=");
    int num1=sc.nextInt();
    System.out.print("total beverages cost=");
    int num2=sc.nextInt();
    System.out.print("gst=");
    float num3=sc.nextFloat();
    System.out.print("tip amount=");
    int num4=sc.nextInt();
    float bill=num1+num2+num3+num4;
   
    System.out.println("total bill of a table ="+" "+bill);
    
    
  }
}