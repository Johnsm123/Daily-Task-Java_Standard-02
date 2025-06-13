package DateTimeAPI;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



         public class Main {
        public static void main(String[] args) {
            // Input project start date
            LocalDate startDate = LocalDate.of(2025, 6, 1);

            // Add duration (e.g., 6 weeks and 2 days)
            LocalDate endDate = startDate.plusWeeks(6).plusDays(2);

            // Calculate days remaining from today
            LocalDate today = LocalDate.now();
            long daysRemaining = ChronoUnit.DAYS.between(today, endDate);

            // Print results
            System.out.println("Start: " + startDate);
            System.out.println("End: " + endDate);
            System.out.println("Remaining: " + daysRemaining + " days");
        }
    }

