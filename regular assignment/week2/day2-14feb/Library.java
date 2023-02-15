 import java.util.*;
class Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter book details");
    int bnum=sc.nextInt();
    String aname=sc.next();
    String bname=sc.next();
    System.out.println("enter member details");
    String sname=sc.next();
    int rnum=sc.nextInt();
    System.out.println("borrowed book details");
    System.out.println("booknumber:"+" "+bnum);
    System.out.println("authorname:"+" "+aname);
    System.out.println("bookname:"+" "+bname);
    System.out.println("member details");
    System.out.println("studentname:"+" "+sname);
    System.out.println("rollnumber:"+" "+rnum);
    
    
    
  }
}