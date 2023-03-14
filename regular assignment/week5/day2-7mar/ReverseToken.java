import java.util.StringTokenizer;
import java.util.*;
class ReverseToken{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String st =sc.nextLine();
    StringTokenizer s=new StringTokenizer(st);
    System.out.println("reverse of each token is ");
    while(s.hasMoreTokens()){
      String str=s.nextToken();
      char a[]=str.toCharArray();
      for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]);
      }
      System.out.print(" ");
      
    }
  }
}
