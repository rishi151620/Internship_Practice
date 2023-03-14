import java.util.*;
class ReverseEachWord{

  static void reverseString(String st){
    String a[] = st.split(" ");
    String rev="";
    for(int i=0;i<a.length;i++){
      rev="";
      char b[]=a[i].toCharArray();
      for(int j=b.length-1;j>=0;j--){
        rev=rev+b[j];
      }
      System.out.print(rev+" ");
    }
    
    
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the string");
    String st=sc.nextLine();
    reverseString(st);
    
    
    
    
  }









  
}