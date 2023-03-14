// Create a class called "BankLoan" with instance variables for loan amount, interest rate, and payment period. Add a constructor that takes loan amount and interest rate as parameters, and calculates the payment period based on the payment amount.
import java.util.*;
class BankLoan{
  int l_amount;
  double int_rate;
  int p_amount;
  double period;

  BankLoan(int l,double r,int p){
    l_amount=l;
    int_rate=r;
    p_amount=p;
  }
  void calculatePeriod(){
    period=p_amount/(l_amount*(int_rate/100)); 
    System.out.println("period of payment is :"+period);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the loan amount :");
    int l=sc.nextInt();
    System.out.println("enter the interest rate :");
    double r=sc.nextDouble();
    System.out.println("enter the payment amount :");
    int p=sc.nextInt();
    BankLoan bl=new BankLoan(l,r,p);
    bl.calculatePeriod();
    
    
  }
  
}