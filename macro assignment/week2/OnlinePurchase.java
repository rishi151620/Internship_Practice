// 4.A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they do not have enough funds, they will be asked to add more money to their account.(uing nested if else)



import java.util.*;
class Online{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the item you want?");
    String item = sc.next();
    int acBalance=1500;
    int totalAmount=0;
    if(item.equals("pen"))
    {
      System.out.println("enter the quantity:");
      int q=sc.nextInt();
      totalAmount=20*q;
      if((totalAmount>acBalance))
      System.out.println(" add more funds to your account ");
    else{
      acBalance=acBalance-totalAmount;
      System.out.println("transaction will be processed = "+acBalance);
    }
    }
    else{
      System.out.println("item is out of stock");
      System.out.println("try again later");
    }
    
    
  }
}