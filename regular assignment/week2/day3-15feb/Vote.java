import java.util.*;
class Vote{
  public static void main(String args[]){
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the age=");
    age=sc.nextInt();
    if(age>=18){
      System.out.println("yes!eligible for voting");
    }else{
      System.out.println("no!not eligible for voting");
    }  
  }
}
