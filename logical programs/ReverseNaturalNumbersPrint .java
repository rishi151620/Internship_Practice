import java.util.Scanner;

public class ReverseNaturalNumbersPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int i = n;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
