import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        int num = 1005;
        int sum = 0;
        int n = num;
        while (n > 0) {
            int r = n % 10;
            sum = sum + (int) Math.pow(r, 3);
            n = n / 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
};
