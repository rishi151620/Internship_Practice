import java.util.*;
class ReverseString{

  static void reverseString(String str){
    char a[] = str.toCharArray();
    String rev ="";
    for(int i=a.length-1;i>=0;i--){
      rev=rev+a[i];

      
    }  
    System.out.println("after reversing the string");
    System.out.println(rev);
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the string");
    String st=sc.nextLine();
    reverseString(st);
    
    
    
    
  }









  
}