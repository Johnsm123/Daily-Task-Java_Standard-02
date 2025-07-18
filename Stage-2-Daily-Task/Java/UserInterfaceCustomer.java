import java.util.Scanner;
public class UserInterfaceCustomer {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CustomerUtility cu = new CustomerUtility();
            CustomerManagementSystem cms = new CustomerManagementSystem();

            System.out.println("Enter the customer id");
            String id = sc.nextLine();

            System.out.println("Enter the customer name");
            String name = sc.nextLine();

            System.out.println("Enter the email");
            String email = sc.nextLine();

            System.out.println("Enter the phoneNo");
            String phoneNo = sc.nextLine();

            boolean isEmailValid = cu.validateCustomerEmail(email);
            boolean isPhoneValid = phoneNo.matches("\\d{10}");

            if (isEmailValid && isPhoneValid) {
                Customer cust = new Customer(id, name, email, phoneNo);
                int status = cms.insertCustomerRecordsToDB(cust);
                if (status == 1) {
                    System.out.println("Customer record is added successfully");
                } else {
                    System.out.println("Failed to add Customer record");
                }
            } else {
                System.out.println("Failed to add Customer record");
            }
        }
    }


