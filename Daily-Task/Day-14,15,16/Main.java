import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        EvenNumber evenNumber = new EvenNumber();
//        evenNumber.printEvenNumber();
//
//
//        EmployeeDetails emp1 = new EmployeeDetails("John",21,55000,"ADM");
//        EmployeeDetails emp2 = new EmployeeDetails("Faizan",22,75000,"Full-Stack-Developer");
//        EmployeeDetails emp3 = new EmployeeDetails("Aryaman",23,60000,"Java-Developer");
//
//        emp1.displayDetails();
//        emp2.displayDetails();
//        emp3.displayDetails();

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Enter age: ");
//        int age = sc.nextInt();
//
//        System.out.println("Enter salary: ");
//        double salary = sc.nextInt();
//
//
//        Employee emp = new Employee(name,age,salary);
//        System.out.println("\nEmployee Details: ");
//        emp.displayEmployeeDetails();


//        Scanner scanner = new Scanner(System.in);
//        Calculator calc = new Calculator();
//
//        try {
//            System.out.print("Enter first number: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double num2 = scanner.nextDouble();
//
//            System.out.println("Addition: " + calc.add(num1, num2));
//            System.out.println("Subtraction: " + calc.subtract(num1, num2));
//            System.out.println("Multiplication: " + calc.multiply(num1, num2));
//
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("Error: Please enter valid numbers");
//        } finally {
//            scanner.close();
//        }

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



