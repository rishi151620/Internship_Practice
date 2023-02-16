import java.util.*;

class Maxnum2{
  public static void main(String args[]){
    int num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first number : ");
    num1=sc.nextInt();
    System.out.print("enetr the second number : ");
    num2=sc.nextInt();
    if(num1>num2){
      System.out.println("first number is maximum");
    }else{
      System.out.println("second number is maximum");
    }
  }
}