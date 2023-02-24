import java.util.*;
class VowelArray{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    char arr[]=new char[n];
    System.out.println("enter the values :");
    for(int i=0;i<n;i++){
      arr[i]=sc.next().charAt(0);   
    }
    System.err.println("vowel array values are :");
    for(int i=0;i<n;i++){
      //even numbers
      if(arr[i]=='a'||arr[i]=='i'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u')
        System.out.println(arr[i]);
    }
    
  }
}