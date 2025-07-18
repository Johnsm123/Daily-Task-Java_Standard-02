import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PaymentSortSystem {
    // Payment.java
    public class Payment {
        private String billNumber;
        private String customerName;
        private double paymentAmount;
        private String paymentMode;

        public Payment() {}

        public Payment(String billNumber, String customerName, double paymentAmount, String paymentMode) {
            this.billNumber = billNumber;
            this.customerName = customerName;
            this.paymentAmount = paymentAmount;
            this.paymentMode = paymentMode;
        }

        public String getBillNumber() { return billNumber; }
        public void setBillNumber(String billNumber) { this.billNumber = billNumber; }
        public String getCustomerName() { return customerName; }
        public void setCustomerName(String customerName) { this.customerName = customerName; }
        public double getPaymentAmount() { return paymentAmount; }
        public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }
        public String getPaymentMode() { return paymentMode; }
        public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

        @Override
        public String toString() {
            return "billNumber=" + billNumber + ", customerName=" + customerName + ", paymentAmount=" + paymentAmount + ", paymentMode=" + paymentMode;
        }
    }

    // InvalidBillNumberException.java
    public class InvalidBillNumberException extends Exception {
        public InvalidBillNumberException(String message) {
            super(message);
        }
    }

// PaymentManagementSystem.java
import java.util.*;

    public class PaymentManagementSystem {
        private List<Payment> paymentList = new ArrayList<>();

        public List<Payment> getPaymentList() {
            return paymentList;
        }

        public void setPaymentList(List<Payment> paymentList) {
            this.paymentList = paymentList;
        }

        public boolean validateBillNumber(String billNumber) throws InvalidBillNumberException {
            if (billNumber.matches("[A-Z][0-9]{5}")) {
                return true;
            } else {
                throw new InvalidBillNumberException("Invalid bill Number-" + billNumber);
            }
        }

        public void addPayment(Payment paymentObj) {
            paymentList.add(paymentObj);
        }

        public List<Payment> sortPayments() {
            List<Payment> sortedList = new ArrayList<>(paymentList);
            sortedList.sort(Comparator.comparing(Payment::getPaymentMode)
                    .thenComparing(Payment::getPaymentAmount));
            return sortedList;
        }
    }

// UserInterface.java
import java.util.*;

    public class UserInterface {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PaymentManagementSystem pms = new PaymentManagementSystem();

            System.out.println("Enter the number of payments");
            int n = Integer.parseInt(sc.nextLine());

            System.out.println("Enter payment details (billNumber:customerName:paymentAmount:paymentMode)");
            for (int i = 0; i < n; i++) {
                String[] data = sc.nextLine().split(":");
                String billNumber = data[0];
                try {
                    if (pms.validateBillNumber(billNumber)) {
                        String customerName = data[1];
                        double amount = Double.parseDouble(data[2]);
                        String mode = data[3];
                        Payment payment = new Payment(billNumber, customerName, amount, mode);
                        pms.addPayment(payment);
                    }
                } catch (InvalidBillNumberException e) {
                    System.out.println(e.getMessage());
                }
            }

            List<Payment> sorted = pms.sortPayments();
            if (sorted.isEmpty()) {
                System.out.println("No records found");
            } else {
                System.out.println("Sorted Payment Details");
                for (Payment p : sorted) {
                    System.out.println(p);
                }
            }
        }
    }

}
