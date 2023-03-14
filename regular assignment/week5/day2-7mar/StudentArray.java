import java.util.*;
class StudentArray{
  int id;
  String name;
  String branch;
  double s1,s2,s3;
  void average(){
    double avg=(s1+s2+s3)/3;
    System.out.println(name+" average is "+avg);
  }
  void percentage(){
    double totalmarks=s1+s2+s3;
    double perc=(totalmarks/300)*100;
    System.out.println(name+" percentage is "+perc);
  }


  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student st[]=new Student[5];
    for(int i=1;i<=5;i++){
      st[i]=new Student();
      System.out.println("enter id");
      st[i].id=sc.nextInt();
      System.out.println("Enter name");
      st[i].name=sc.next();
      System.out.println("Enter branch");
      st[i].branch=sc.next();
      System.out.println("Enter sub1");
      st[i].s1=sc.nextDouble();
      System.out.println("Enter sub2");
      st[i].s2=sc.nextDouble();
      System.out.println("Enter sub3");
      st[i].s3=sc.nextDouble();
      st[i].average();
      st[i].percentage();
      
      
    
    }
    
  }
  
  
}