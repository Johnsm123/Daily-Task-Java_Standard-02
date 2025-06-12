public class FinallyAlwaysExecute {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            // Simulate an exception
            int result = 10 / 0;
            System.out.println("This won't execute");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Caught " + e.getMessage());
        } finally {
            System.out.println("Inside finally block: This always executes");
        }
        System.out.println("After try-catch-finally");
    }
}
