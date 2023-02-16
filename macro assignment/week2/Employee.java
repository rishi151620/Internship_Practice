// 2.A company gives its employees a bonus based on their performance. If an employee's performance is rated as "Excellent", they will receive a bonus of 10% of their salary. If their performance is rated as "Good", they will receive a bonus of 5% of their salary. If their performance is rated as "Average", they will receive a bonus of 2% of their salary. If their performance is rated as "Poor", they will receive no bonus.

import java.util.Scanner;
class Employee{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Salary");
    int sal=sc.nextInt();
    System.out.println("Select your performance rating:");
    String p=sc.next();
    double b=0;
    if(p.equals("EXCELLENT"))
    {
      b=0.1*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p.equals("GOOD"))
    {
      b=0.05*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p.equals("Average"))
    {
      b=0.02*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p.equals("Poor"))
    {
      System.out.println("No Bonus:");
    }
    else
      System.out.println("Invalid input");
  }
}