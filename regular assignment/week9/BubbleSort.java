import java.util.*;
class BubbleSort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int temp=0;
    System.out.println("enter the elements ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    //bubble sort
    for(int i=0;i<n;i++){
      for(int j=1;j<(n-1-i);j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("sorted array :");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}