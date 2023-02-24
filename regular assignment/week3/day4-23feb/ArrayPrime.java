import java.util.*;
class ArrayPrime{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the values :");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();   
    }
    System.err.print("prime numbers are : ");
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0)
          count++;
      }
    
    if(count==2)
      System.out.print(arr[i]+" ");
    }
    
  }
}