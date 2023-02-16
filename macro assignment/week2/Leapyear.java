import java.util.*;

class Leapyear{
  public static void main(String args[]){
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the year : ");
    year=sc.nextInt();
    if((year%4==0) && (year%100!=0)||(year%400==0)){
      System.out.println("it is a leap year ");
    }
    else{
      System.out.println("it is not a leap year");
    }
  }
}