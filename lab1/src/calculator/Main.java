import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // double euro =Double.valueOf(System.getenv("EUR"));
        // System.out.println(euro);
        double n1, n2;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        n1 = scanner.nextDouble();

        System.out.println("Enter second number");
        n2 = scanner.nextDouble();

        System.out.println("Enter operation");
        operation = scanner.next();

        Calculator calculator = new Calculator();
        double result = 0;

        switch (operation) {
            case "+":
                result = calculator.sum(n1, n2);
                break;
            case "-":
                result = calculator.subtract(n1, n2);
                break;
            case "*":
                result = calculator.multiply(n1, n2);
                break;
            case "/":
                result = calculator.divide(n1, n2);
                break;
        }
        System.out.println(result);
    }
}


