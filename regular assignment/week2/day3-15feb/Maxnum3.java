import java.util.*;

class Maxnum3{
  public static void main(String args[]){
    int num1,num2,num3;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first number : ");
    num1=sc.nextInt();
    System.out.print("enetr the second number : ");
    num2=sc.nextInt();
    System.out.print("enter the third number : ");
    num3=sc.nextInt();
    if(num1>num2 && num1>num3){
      System.out.println("first number is maximun");
    }
    else if(num2>num3){
      System.out.println("second number is maximum");
    }
    else{
      System.out.println("third number is maximum");
    } 
  }
}
