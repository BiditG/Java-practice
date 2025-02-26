import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        String operator = input.next();
        double answer = 0;

        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                answer = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("The answer is: " + answer);
    }
}


