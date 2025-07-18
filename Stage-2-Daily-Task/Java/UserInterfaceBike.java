import java.util.Scanner;
public class UserInterfaceBike {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the bike details");
            String input = sc.nextLine();

            try {
                Bike bike = Bike.verifyBikeDetails(input);
                System.out.println("Bike Details:");
                System.out.println("Bike Model: " + bike.getBikeModel());
                System.out.println("Bike Type: " + bike.getBikeType());
                System.out.println("Bike Status: " + bike.getBikeStatus());
                System.out.println("Bike Price: " + bike.getBikePrice());
            } catch (InvalidBikeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


