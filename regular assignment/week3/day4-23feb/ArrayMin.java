import java.util.*;
class ArrayMin{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the values :");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();   
    }
    int min=arr[0];
    System.err.print("minimum number is : ");
    for(int i=0;i<n;i++){
        if(arr[i]<min)
          min=arr[i];
      }
    System.out.println(min);
   
  }
}