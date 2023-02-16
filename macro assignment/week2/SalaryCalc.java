// Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.

import java.util.Scanner;
class SalaryCalc{
 public static void main(String args[]){
  int salary,anlsal;
  double tax;
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the monthly salary : ");
  salary=sc.nextInt();
  anlsal=salary*12;
   System.out.println("anual salary will be : "+anlsal);
   if(anlsal<=300000)
     System.out.println("tax rate = nil");
   else if(anlsal<=600000){
     tax=anlsal*0.05;
     System.out.println("tax rate = "+tax);
   }else if(anlsal<=900000){
     tax=anlsal*0.10;
     System.out.println("tax rate = "+tax);
   }else if (anlsal<=1200000){
     tax=anlsal*0.15;
     System.out.println("tax rate = "+tax);
   }else if (anlsal<=1500000){
     tax=anlsal*0.20;
     System.out.println("tax rate = "+tax);
   }else{
     tax=anlsal*0.30;
     System.out.println("tax rate = "+tax);
   }


  


   
 }
}
