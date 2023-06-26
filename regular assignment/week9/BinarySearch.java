import java.util.*;
class BinarySearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int  n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int start = 0, stop = arr.length - 1;
    int mid = (start + stop) / 2;
    System.out.println("enter the search element ");
    int key=sc.nextInt();
    while(true){
      if(arr[mid]==key)
        System.out.println(arr[mid]+" is found at index "+mid);
      else if(arr[mid]>key){
        start=start;
        stop=mid-1;
        mid=(start+stop)/2;
      }
      else if(arr[mid]<key){
        stop=stop;
        start=mid+1;
        mid=(start+stop)/2;
      }
    }

  }
}