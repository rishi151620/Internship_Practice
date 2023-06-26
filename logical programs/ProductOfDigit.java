import java.util.Scanner;

 class ProductOfDigit{

public static void main(String[] args) {
int Number, Reminder, product = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter any Number: ");
Number = sc.nextInt();

while(Number > 0) {
Reminder = Number % 10;
product = product*Reminder;
Number = Number / 10;
}
System.out.println("product of the digits of Given Number "+product);
}
}