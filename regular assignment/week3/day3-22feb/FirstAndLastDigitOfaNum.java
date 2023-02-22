import java.util.Scanner;
 class FirstAndLastDigitOfaNum {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int firstDigit = 0,lastDigit=0;
      System.out.println("Enter a number ::");
      int num = sc.nextInt();
      lastDigit=(num%10);
     System.out.println("Last digit "+lastDigit);
      while(num!=0){
       firstDigit = num%10;
         num = num/10;
          }
      System.out.println("first digit: "+firstDigit);
   }
}