import java.util.Scanner;
class MultiplicationIndex{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the value");
    int value = sc.nextInt();
    for (int i = 0; i < size; i++)
    {
      for(int j=0; j<i; j++)
      {  
        if(arr[i]*arr[j]==value)
          System.out.println(i+" "+j);
      }
    }
  }
}