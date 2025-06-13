import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeApi {
        class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a future event date (YYYY-MM-DD): ");
            String inputDate = scanner.nextLine();

            try {
                LocalDate eventDate = LocalDate.parse(inputDate);
                LocalDate today = LocalDate.now();
                if (eventDate.isBefore(today) || eventDate.isEqual(today)) {
                    System.out.println("Please enter a future date.");
                    return;
                }

                Period period = Period.between(today, eventDate);
                System.out.printf("Your event is in %d months and %d days.%n",
                        period.getMonths(), period.getDays());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            } finally {
                scanner.close();
            }
        }
    }
}
