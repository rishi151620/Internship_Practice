import java.util.*;
class Compare2String{
  static void compareStr(String str1,String str2){
  System.out.println(str1.compareTo(str2));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string 1");
    String str1=sc.nextLine();
    System.out.println("enter the string 2");
    String str2=sc.nextLine();
    
    compareStr(str1,str2);
  }
}