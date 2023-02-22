import java.util.*;
class SumOfFirstLast{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number :");
    int num=sc.nextInt();
    int lastdigit=0,firstdigit=0,sum=0;
    lastdigit=num%10;
    while(num>10){
       
      num=num/10;
      
    }firstdigit=num;
   
    sum=firstdigit+lastdigit;
    System.out.println("sum of first and last digit is :"+sum);
    
  }
}