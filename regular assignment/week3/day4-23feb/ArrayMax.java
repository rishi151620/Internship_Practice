import java.util.*;
class ArrayMax{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the values :");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();   
    }
    int max=arr[0];
    System.err.print("maximum number is : ");
    for(int i=0;i<n;i++){
        if(arr[i]>max)
          max=arr[i];
      }
    System.out.println(max);
   
  }
}