import java.util.*;
class MultiTableWhile{
  public static void main(String args[]){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n");
    n=sc.nextInt();
    while(i<=10){
      System.out.println(n+"*"+i+" "+"="+" "+(n*i));
      i++;
    }
  }
}