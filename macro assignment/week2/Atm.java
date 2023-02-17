// user balance=1000; user pin=1234

import java.util.*;

class Atm{
  public static void main(String args[]){
    int ubal=1000;
    int pin=1234,withamt,damt,userchoice,upin,npin;
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("wlcome to the our bank");
    System.out.println("enter the pin");
    upin=sc.nextInt();
    if(upin==pin){
      System.out.println("please select a option");
      
System.out.println("1.checkbalance,2.withdraw,3.deposit,4.changepin,5.Quit");
      userchoice=sc.nextInt();
       if(userchoice==1){
         System.out.println("user balance = "+ubal);
       }else if (userchoice==2){
         System.out.println("enter the amount");
         withamt=sc.nextInt();
         if(withamt>ubal){
           System.out.println("you have insufficient balance");
         }else{
           ubal=ubal-withamt;
           System.out.println("ammount withdraw successfull");
           System.out.println("remaining balance in your account = "+ubal);
             }
         
       }else if(userchoice==3){
         System.out.println("how much amount you want to deposit");
         damt=sc.nextInt();
         ubal=ubal+damt;
         System.out.println("amount is deposit is successful! balance = " +ubal);
         
       }else if(userchoice==4){
         System.out.println("enter the new pin");
         npin=sc.nextInt();
         pin=npin;
         
         System.out.println("your pin has been changed!! your new pin is :"+npin);
         
       }else if(userchoice==5){
         System.out.println("thank you come again im waiting for you zaldi ajjao");
       }else{
         System.out.println("invalid option select valid option");
           }
         
       }else 
           System.out.println("you entered invalid pin please check again");
   
    
  }
}