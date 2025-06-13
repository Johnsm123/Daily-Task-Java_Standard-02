import java.util.Arrays;
import java.util.List;

public class EmployeeNameFilter {
    public static void main(String[] args) {
        // Sample list of employee names
        List<String> employees = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Amy");

        // Stream processing: filter names starting with 'A', convert to uppercase, and print
        employees.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
