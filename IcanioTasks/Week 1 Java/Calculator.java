import java.util.Scanner;

public class Calculator {
    public static int addition(int a, int b) {
        return(int) a + b;
    }
    public static int division(int a, int b) {
        return(int) a / b;
    }
    public static int multiplication(int a, int b) {
        return(int) a * b;
    }
    public static int subraction(int a, int b) {
        return(int) a - b;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            String num1 = sc.nextLine();
            System.out.println("Enter second number: ");
            String num2 = sc.nextLine();
            float a= Float.parseFloat(num1);
            float b = Float.parseFloat(num2);
            System.out.println("Enter the choice of operation (+, -, *, /):");
            String operation = sc.nextLine();

            int result = 0;
            boolean valid = true;

            switch (operation) {
                case "+":
                    result = addition(a, b);
                    break;
                case "-":
                    result = subraction(a, b);
                    break;
                case "*":
                    result = multiplication(a, b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Division by zero is not allowed.");
                        valid = false;
                    } else {
                        result = division(a, b);
                    }
                    break;
                default:
                    System.out.println("Enter valid operator");
                    valid = false;
                    break;
            }
            if (valid) {
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, please enter valid numbers and operator.");
        } finally {
            System.out.println("Thank you for using the calculator!");
        }
    }
}