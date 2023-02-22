import java.util.*;
class SumOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i,sum=0;
    System.out.println("sum of odd numbers are :");
    for(i=1;i<=n;i=i+2){
      sum=sum+i;
    }
    System.out.println(sum);

  
    
  }
}