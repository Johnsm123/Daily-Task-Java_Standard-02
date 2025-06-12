public class ExceptionChaining {
    public static double divideNumbers(double a, double b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            throw new IllegalArgumentException("Failed to perform division", ae);
        }
    }

    public static void processCalculation() {
        try {
            divideNumbers(10.0, 0.0);
        } catch (IllegalArgumentException iae) {
            System.out.println("Caught IllegalArgumentException: " + iae.getMessage());
            System.out.println("Caused by: " + iae.getCause());
        }
    }

    public static void main(String[] args) {
        processCalculation();
    }
}
