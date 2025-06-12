import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Validate array size
            if (size <= 0) {
                throw new IllegalArgumentException("Array size must be positive");
            }

            // Create and populate array
            double[] numbers = new double[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextDouble();
            }

            // Accept index to access
            System.out.print("Enter the index to access (0 to " + (size-1) + "): ");
            int index = scanner.nextInt();

            // Access and print element
            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index within the array bounds.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
