import java.util.*;
class StringConvert{

  static void reverseString(String str){
    char a[] = str.toCharArray();
    for(int i=0;i<=a.length-1;i++)
      System.out.println(a[i]);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the string");
    String st=sc.nextLine();
    reverseString(st);
    
    
    
    
  }
}
