// Create a class called BankAccount with attributes balance and interest_rate. Create a subclass called SavingsAccount that inherits from BankAccount and adds an attribute min_balance. Create a method in SavingsAccount called withdraw() that subtracts an amount from the balance, but only if the resulting balance is greater than or equal to the minimum balance.
import java.util.*;
class BankAccount{
  double balance=50000;
  float intrestRate=10.00f;
  
}
class SavingsAccount extends BankAccount{
  double minBalance=500;
  Scanner sc = new Scanner(System.in);
  void withDraw(){
    while(true){
      System.out.println("Enter the Amount to withdraw");
      double a = sc.nextDouble();
      double balance1 = balance-a;
      if(balance1>=minBalance){
        System.out.println("Balance is "+balance1);
        break;
      }
      else{
        System.out.println("insufficient funds");
      }
    
    }
  }
}
public class InheritanceBank{
  public static void main(String args[]){
    SavingsAccount vh = new SavingsAccount();
    vh.withDraw();
  }
}