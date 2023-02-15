import java.util.*;
class Grade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter english marks");
    int num1=sc.nextInt();
    System.out.println("enter maths marks");
    int num2=sc.nextInt();
    System.out.println("enter science marks");
    int num3=sc.nextInt();
    int average=(num1+num2+num3)/3;
    System.out.println("average of 3 sybject="+" "+average);
    
    
    
  }
}