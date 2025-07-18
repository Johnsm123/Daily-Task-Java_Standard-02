import java.util.Scanner;
public class UserInterfaceCal {




        // Static method using lambda to calculate slope
        public static Calculate calculateSlope() {
            return (x1, x2, y1, y2) -> {
                if (x2 - x1 == 0) {
                    return "Slope is undefined"; // Avoid division by zero
                }
                int slope = (y2 - y1) / (x2 - x1);
                return "Slope of the line is " + slope;
            };
        }

        // Static method using lambda to calculate midpoint
        public static Calculate calculateMidpoint() {
            return (x1, x2, y1, y2) -> {
                int midX = (x1 + x2) / 2;
                int midY = (y1 + y2) / 2;
                return "Mid point of the line is (" + midX + "," + midY + ")";
            };
        }

        // Main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the values for x intercepts and y intercepts");

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            // Get Calculate objects from lambda static methods
            Calculate slopeCalc = calculateSlope();
            Calculate midpointCalc = calculateMidpoint();

            // Perform calculations
            String slopeResult = slopeCalc.performCalculation(x1, x2, y1, y2);
            String midpointResult = midpointCalc.performCalculation(x1, x2, y1, y2);

            // Display results
            System.out.println(slopeResult);
            System.out.println(midpointResult);
        }
    }


