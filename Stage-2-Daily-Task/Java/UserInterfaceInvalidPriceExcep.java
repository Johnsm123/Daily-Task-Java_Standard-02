import java.util.Scanner;
public class UserInterfaceInvalidPriceExcep {




        // Method to validate product price
        public static boolean validateProductPrice(int price) throws InvalidPriceException {
            if (price >= 1 && price <= 20) {
                return true;
            } else {
                throw new InvalidPriceException("Product price is invalid");
            }
        }

        // Main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of product entries");
            int count = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter product " + i + " details");
                String productInput = sc.nextLine();

                // Split the input by ':'
                String[] details = productInput.split(":");

                try {
                    int price = Integer.parseInt(details[2]);
                    if (validateProductPrice(price)) {
                        System.out.println("Stock updated");
                    }
                } catch (InvalidPriceException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price format");
                }
            }
        }
    }


