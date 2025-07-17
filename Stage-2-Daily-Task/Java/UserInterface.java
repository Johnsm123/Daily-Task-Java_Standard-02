import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the Name");
        String name = scanner.nextLine();

        System.out.println("Enter the Order Number");
        int orderNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the Delivery Type");
        String deliveryType = scanner.nextLine();

        // Validate delivery type
        if (!deliveryType.equals("HomeDelivery") && !deliveryType.equals("Parcel") && !deliveryType.equals("NormalOrder")) {
            System.out.println("Invalid Order Type");
            scanner.close();
            return; // Terminate program
        }

        System.out.println("Enter the Food Name");
        String foodName = scanner.nextLine();

        System.out.println("Enter the Phone Number");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter the price of the item");
        double price = scanner.nextDouble();

        // Create Restaurant object
        Restaurant restaurant = new Restaurant(name, orderNumber, deliveryType, foodName, phoneNumber);

        // Calculate bill
        double billAmount = restaurant.calculateTotalBill(price);

        // Display output
        System.out.println("Name " + restaurant.getCustomerName());
        System.out.println("Order Number " + restaurant.getOrderNumber());
        System.out.println("Delivery Type " + restaurant.getDeliveryType());
        System.out.println("Food Name " + restaurant.getFoodName());
        System.out.println("Phone Number " + restaurant.getPhoneNumber());
        System.out.printf("Bill Amount %.1f\n", billAmount);

        scanner.close();
    }
}