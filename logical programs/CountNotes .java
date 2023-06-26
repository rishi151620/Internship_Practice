import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int count = 0;

        for (int i : notes) {
            count += amount / i;
            amount %= i;
        }

        System.out.println("Total number of notes: " + count);
    }
}
