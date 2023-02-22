import java.util.*;
class FactorDo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n =sc.nextInt();
    int i=1;
    System.out.println("factors of"+" "+n+" "+"are :");
    do{
      if(n%i==0){
        System.out.println(i);
      }
      i++;
    }
    while(i<=n/2);
  }
}