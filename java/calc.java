import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display calculator options
        System.out.println("Extended Java Calculator");
        System.out.println("Choose an operation: +, -, *, /, %, ^ (modulus, exponentiation)");
        char operator = scanner.next().charAt(0);

        // Input first and second number
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result;

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}
