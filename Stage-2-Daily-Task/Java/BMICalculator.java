import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get User Input
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your height in meters");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight in kilograms");
        double weight = scanner.nextDouble();

        // Step 2: Calculate BMI
        double bmi = weight / (height * height);

        // Step 3: Determine Category
        String category;
        if (bmi < 18.5) {
            category = "Under weight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Over weight";
        } else {
            category = "Obese";
        }

        // Step 4: Display Output
        System.out.printf("Hello %s, Your BMI is %.2f%n", name, bmi);
        System.out.println("You are under the category " + category);

        scanner.close();
    }
}