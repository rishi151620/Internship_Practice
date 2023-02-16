import java.util.*;
class RockPaper{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the user choice : ");
  String u =sc.next();
  System.out.print("enter the computer choice : ");
  String c =sc.next();
  if(u.equals(c))
    System.out.println("it is  tie");
  else if((u.equals("rock") && c.equals("paper"))||(u.equals("scissor") && c.equals("rock"))||(u.equals("paper") && c.equals("scissor")))
    System.out.println("computer wins");
  else if ((u.equals("paper") && c.equals("rock"))||(u.equals("scissor") && c.equals("paper"))||(u.equals("rock") && c.equals("scissor")))
      System.out.println("user wins");
  else 
    System.out.println("losers");
    
  
  
  
  
    
  }
}