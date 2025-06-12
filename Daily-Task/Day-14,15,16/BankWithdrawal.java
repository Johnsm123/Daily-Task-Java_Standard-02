import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // Initial balance $1000

        try {
            System.out.println("Current balance: $" + account.getBalance());
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid number");
        } finally {
            scanner.close();
            System.out.println("Transaction processing completed.");
        }
    }
}
