import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("SCIENTIFIC CALCULATOR");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXPONENTIATION");
            System.out.println("6. SQUARE ROOT");
            System.out.println("7. QUIT");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the Calculator.");
                break;
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = performAddition(scanner);
                    break;
                case 2:
                    result = performSubtraction(scanner);
                    break;
                case 3:
                    result = performMultiplication(scanner);
                    break;
                case 4:
                    result = performDivision(scanner);
                    break;
                case 5:
                    result = performExponentiation(scanner);
                    break;
                case 6:
                    result = performSquareRoot(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    public static double performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double performDivision(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }

    public static double performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot compute square root of a negative number.");
            return Double.NaN;
        }
    }

    public static double performExponentiation(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}

