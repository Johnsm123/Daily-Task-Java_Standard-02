import java.util.Scanner;

public class UserInterfacess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter user name:");
        String userName = sc.nextLine();

        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();

        System.out.println("Enter number of steps taken:");
        int stepsTaken = sc.nextInt();

        System.out.println("Enter distance covered in km:");
        double distanceCovered = sc.nextDouble();

        System.out.println("Is the user running?(true/false):");
        boolean runningStatus = sc.nextBoolean();

        // Create user data object
        UserFitnessData user = new UserFitnessData(userName, weight, stepsTaken, distanceCovered, runningStatus);

        // Output
        System.out.println("\nUser Name: " + user.getUserName());
        System.out.println("Weight: " + user.getWeight() + " kg");
        System.out.println("Steps Taken: " + user.getStepsTaken());
        System.out.println("Distance Covered: " + user.getDistanceCovered() + " km");
        System.out.println("Running: " + user.isRunningStatus());

        String fitnessLevel = user.findFitnessLevel();
        System.out.println("Fitness Level: " + fitnessLevel);

        double calories = FitnessMonitor.calculateCaloriesBurnt(weight, distanceCovered, runningStatus);
        System.out.printf("Calories Burnt: %.2f\n", calories);
    }
}
