// 14. WAP to input basic salary of an employee and calculate its Gross     salary according to following:
//     Basic Salary <= 10000 : HRA = 20%, DA = 80%
//     Basic Salary <= 20000 : HRA = 25%, DA = 90%
//     Basic Salary > 20000 : HRA = 30%, DA = 95%



import java.util.*;

class Grosssalary{
  public static void main(String args[]){
    double basic_salary,hra,da,g_salary;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the salary : ");
    basic_salary =sc.nextDouble();
   if(basic_salary <= 10000){
        hra = (basic_salary)*0.2;
        da= (basic_salary)*0.8;
       g_salary = basic_salary+hra+da;
     System.out.println("hra = "+ hra +" "+"da ="+da);
      System.out.println("gross salary = "+ g_salary);
   }else if(basic_salary <= 20000){
       hra  = (basic_salary)*0.2;
       da    = (basic_salary)*0.9;
     System.out.println("hra = "+ hra +" "+"da ="+da);
       g_salary = basic_salary+hra+da;
    System.out.println("gross salary = "+ g_salary);
   }else if (basic_salary > 20000){
     hra  = (basic_salary)*0.95;
     da    = (basic_salary)*0.3;
     System.out.println("hra = "+ hra +" "+"da ="+da);
     g_salary = basic_salary+hra+da;
     System.out.println("gross salary = "+g_salary);
   }


  }
}
// 15. WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
//     For first 50 units Rs. 0.50/unit
//     For next 100 units Rs. 0.75/unit
//     For next 100 units Rs. 1.20/unit
//      For unit above 250 Rs. 1.50/unit
//      An additional surcharge of 20% is added to the bill