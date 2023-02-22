import java.util.*;
class SumEven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i,sum=0;
    System.out.println("sum of even numbers are :");
    for(i=2;i<=n;i=i+2){
      sum=sum+i;
    }
    System.out.println("sum = "+sum);

  
    
  }
}