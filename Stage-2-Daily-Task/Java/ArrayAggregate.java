import java.util.Scanner;
public class ArrayAggregate {




        // Method to parse and compute the sum with exception handling
        public static String sumOfArrays(String data) throws NegativeArraySizeException, NumberFormatException, ArrayIndexOutOfBoundsException {
            String[] parts = data.split(":");

            int size;
            try {
                size = Integer.parseInt(parts[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Provide a valid Integer");
            }

            if (size < 0) {
                throw new NegativeArraySizeException("Provide a positive Integer to allocate memory for the array");
            }

            int[] array = new int[size];
            int sum = 0;

            try {
                for (int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(parts[i + 1]); // i+1 because index 0 is size
                    sum += array[i];
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Provide a valid Integer");
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Error: Array index is out of range");
            }

            return "Sum of the array elements is " + sum;
        }

        // Main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the data");
            String input = sc.nextLine();

            try {
                String result = sumOfArrays(input);
                System.out.println(result);
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }


