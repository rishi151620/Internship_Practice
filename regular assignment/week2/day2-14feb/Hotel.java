import java.util.*;
class Hotel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter room price");
    int num1=sc.nextInt();
    System.out.println("enter number of nights");
    int num2=sc.nextInt();
    int cost=num1*num2;
    System.out.println("totalcost:"+" "+cost);
   
    
  }
}