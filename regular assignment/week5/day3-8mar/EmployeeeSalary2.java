import java.util.Scanner;
class Employeee{
  int eid;
  String name;
  double salary;
  //parameterized Constructor
  Employeee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
 
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println("total salary is :");
    System.out.println(totalSalary);
  }
 
  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
  
}
 
public class EmployeeeSalary2{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Employeee emp[]=new Employeee[5];
    for(int i=0;i<5;i++){
      System.out.println("enter the employee "+(i+1)+" details :");
      System.out.println("enter the id");
      int id=sc.nextInt();
      System.out.println("enter the name :");
      String name=sc.next();
      System.out.println("enter the salary :");
      double sal=sc.nextDouble();
      emp[i]=new Employeee(id,name,sal);
    }
   
    for(int i=0;i<5;i++){
      System.out.println("********Employee Information*********");
      emp[i].display();
      System.out.println("enter hra : ");
      double hra=sc.nextDouble();
      System.out.println("enter da : ");
      double da=sc.nextDouble();
      emp[i].grossSalary(hra,da);
    }
      
  }
}
