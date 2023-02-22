import java.util.*;
class SumOddWhile{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i=1,sum=0;
    System.out.println("sum of odd numbers = :");
    while(i<=n){
      
      if(i%2!=0){
        sum=sum+i;
      }
      i=i+1;

    }
    System.out.println(sum);
    
  }
}