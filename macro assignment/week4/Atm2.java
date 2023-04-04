// ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.


import java.util.*;
class Account1{
  int acNum;
  int balance;
  String account;
  String holderName;
}
class ATMSimulator{
    int n=3;
    Account1 e[]=new Account1[n];
    Scanner sc= new Scanner(System.in);
  void addAccount(){
  
    for(int i=0; i<n; i++){
      e[i]= new Account1();
      System.out.println("Enter Account holdder name");
      e[i].holderName=sc.next();
      System.out.println("Enter AC number");
      e[i].acNum=sc.nextInt();
      System.out.println("Enter Account balance");
      e[i].balance=sc.nextInt();
      System.out.println("Enter AC type");
      e[i].account=sc.next();
    }
  }
  void removeAccount(){
    int index=-1;
    System.out.println("Enter the AC number you want to remove");
    int rem = sc.nextInt();
    for(int i=0; i<2; i++){
      if(rem==e[i].acNum){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index; i<e.length-1; i++){
        e[i]=e[i+1];
      }
      n--;
      display();
    }
  }
  void display(){
    System.out.println("Account holder names are");
    for(int i=0; i<n; i++){
      System.out.println(e[i].holderName);
    }
  }
}
class Atm{
  public static void main(String args[]){
    ATMSimulator c=new ATMSimulator();
    c.addAccount();
    c.display();
    c.removeAccount();
  }
}