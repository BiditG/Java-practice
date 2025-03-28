
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();
        int first = 0, second = 1, sum = 0;
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            if (i < n) {
                sum = first + second;
                first = second;
                second = sum;
            }
        }
        scanner.close();
    }
}
