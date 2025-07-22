import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 InPatient");
        System.out.println("2 OutPatient");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.println("Enter the Details");
            System.out.println("Patient Id");
            String id = sc.nextLine();

            System.out.println("Patient Name");
            String name = sc.nextLine();

            System.out.println("Phone Number");
            String phone = sc.nextLine();

            System.out.println("Medical Amount");
            double medical = sc.nextDouble();

            System.out.println("Room Rent");
            double rent = sc.nextDouble();

            System.out.println("Number of Days");
            int days = sc.nextInt();

            System.out.println("Test Charges");
            double test = sc.nextDouble();

            InPatient in = new InPatient(id, name, phone, medical, rent, days, test);
            double total = in.calculateTotalBill();
            System.out.println(name + " your id is " + id + " and Bill amount is " + total);

        } else if (choice == 2) {
            System.out.println("Enter the Details");
            System.out.println("Patient Id");
            String id = sc.nextLine();

            System.out.println("Patient Name");
            String name = sc.nextLine();

            System.out.println("Phone Number");
            String phone = sc.nextLine();

            System.out.println("Medical Amount");
            double medical = sc.nextDouble();

            System.out.println("Consultancy Fee");
            double consult = sc.nextDouble();

            OutPatient out = new OutPatient(id, name, phone, medical, consult);
            double total = out.calculateTotalBill();
            System.out.println(name + " your id is " + id + " and Bill amount is " + total);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
