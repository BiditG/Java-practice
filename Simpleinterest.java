import java.util.Scanner;

public class Simpleinterest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the principal amount");
            int p = sc.nextInt();
            System.out.println("Enter the rate of interest");
            int r = sc.nextInt();
            System.out.println("Enter the time");
            int t = sc.nextInt();
            double si = (p * r * t) / 100;
            System.out.println("Simple interest is " + si);

            
}
