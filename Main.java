import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        // Validate the first number
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid number!");
            scanner.close();
            return;
        }
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        // Validate the second number
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid number!");
            scanner.close();
            return;
        }
        double n2 = scanner.nextDouble();

        // Formula
        double sum = n1 + n2;
        double difference = n1 - n2;
        double product = n1 * n2;

        // Format results to two decimal places
        System.out.println("\n-----Math Simulation-----");
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Validating if n2 is not(!) equal(=) to zero(0)
        if (n2 != 0) {
            double quotient = n1 / n2;
            System.out.printf("Quotient: %.2f%n", quotient);

        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}