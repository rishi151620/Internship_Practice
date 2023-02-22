import java.util.*;
class NToIWhile{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i=n-1;
    while(i>=1){
      System.out.println(i);
      i--;
    }
    
  }
}