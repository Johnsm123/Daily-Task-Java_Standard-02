import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                throw new IllegalArgumentException("Array size must be positive");
            }

            double[] numbers = new double[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextDouble();
            }

            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();

            try {

                System.out.print("Enter divisor: ");
                double divisor = scanner.nextDouble();


                double result = numbers[index] / divisor;
                System.out.println("Result of division: " + result);

            } catch (ArithmeticException e) {

                System.out.println("Inner catch: Division error - " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Outer catch: Invalid index - " + e.getMessage());
        } catch (IllegalArgumentException e) {

            System.out.println("Outer catch: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {

            System.out.println("Outer catch: Please enter valid numbers");
        } finally {
            scanner.close();
            System.out.println("Scanner closed in finally block");
        }
    }
}
