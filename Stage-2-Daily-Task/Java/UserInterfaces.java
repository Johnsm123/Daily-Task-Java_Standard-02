
    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

    public class UserInterfaces {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt for check-in date and time
            System.out.println("Enter check in date and time");
            String checkInInput = scanner.nextLine();

            // Define input and output formatters
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

            try {
                // Parse check-in date and time
                LocalDateTime checkInDateTime = LocalDateTime.parse(checkInInput, inputFormatter);

                // Prompt for number of hours of stay
                System.out.println("Enter number of hours of stay");
                int hoursOfStay = scanner.nextInt();

                // Calculate check-out date and time
                LocalDateTime checkOutDateTime = checkInDateTime.plusHours(hoursOfStay);

                // Format and display check-in and check-out details
                System.out.println("Check in Date and Time is " + checkInDateTime.format(outputFormatter));
                System.out.println("Check out Date and Time is " + checkOutDateTime.format(outputFormatter));

            } catch (DateTimeParseException e) {
                // Handle invalid date/time format
                System.out.println(checkInInput + " is an invalid check in date or time");
            }

            scanner.close();
        }
    }

