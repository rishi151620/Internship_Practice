import java.util.Scanner;

public class SumOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers between 1 and " + n + " is: " + sum);

        scanner.close();
    }
}
