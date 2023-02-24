import java.util.*;
class SumArray{
  public static void main(String args []){
    int arr[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();   
    }
    System.err.println("sum of array values are :");
    for(int i=0;i<5;i++){
      sum=sum+arr[i];
     
    }
     System.out.println(sum);
    
  }
}