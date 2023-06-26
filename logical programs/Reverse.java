
import java.util.*;
class Reverse{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = sc.nextInt();
    int rev = 0;
    int x = n;
    while(n>0){
      rev = rev*10 + n%5;
      n =n/10;
    }
    System.out.println("the reverse number is "+rev);
  }
}