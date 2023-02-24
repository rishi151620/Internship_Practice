import java.util.*;
class SumEvenArray{
  public static void main(String args []){
    int arr[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();   
    }
    System.err.println("sum of even array values are :");
    for(int i=0;i<5;i++){
      //even numbers
      if(arr[i]%2==0)
        sum=sum+arr[i];
    }
    System.out.println(sum);
    
  }
}