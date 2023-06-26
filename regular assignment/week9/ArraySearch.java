import java.util.Scanner;
class ArraySearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int  n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the element to be searched");
    int searchElement=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++){
      if(arr[i]==searchElement){
        System.out.println(arr[i]+" is found at index "+i);
        c++;
        break;
      }
    }
    if(c==0){
      System.out.println("invalid element ");
    }
  }
}