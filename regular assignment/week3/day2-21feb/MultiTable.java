import java.util.*;
class MultiTable{
  public static void main(String args[]){
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n");
    n=sc.nextInt();
    for(i=1;i<=10;i++){
      System.out.println(n+"*"+i+" "+"="+" "+(n*i));
    }
  }
}