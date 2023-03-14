// You are given a string that contains both letters and digits. Write a program to separate the letters from the digits and store them in separate arrays. How could you optimize your program to handle very large input strings efficiently?
import java.util.*;
class StringSeperate{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string : ");
    String str=sc.nextLine();
    
    char a[]=str.toCharArray();
    int b[]=new int[a.length];
    char c[]=new char[a.length];
    System.out.print("digits are : ");
    for(int i=0;i<a.length;i++){
      if(a[i]>='0' && a[i]<='9'){
        b[i]=a[i];
        System.out.print((char)b[i]+" ");
      }
    }
    System.out.println();
    System.out.print("letters are : ");
    for(int i=0;i<a.length;i++){
      if(a[i]>='a'&&a[i]<='z'){
        c[i]=a[i];
        System.out.print(c[i]+" ");
      }
    }
    
   
    
    
  }
}