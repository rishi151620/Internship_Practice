import java.util.*;

class Palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the naumber");
    int num =sc.nextInt();
    int n1=num;
    int rem=0,rev=0;
    while(num!=0){
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10;
    }
    if(rev==n1)
      System.out.println(n1+" is a palindrome ");
    else 
      System.out.println(n1+" is not a palindrome ");
  }
}