import java.util.*;
class CountNum{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number :");
    int num=sc.nextInt();
    int count=0;
    while(num!=0){
      num=num/10;
      count=count+1;
    }
    System.out.println("number of digits = "+count);
    
  }
}