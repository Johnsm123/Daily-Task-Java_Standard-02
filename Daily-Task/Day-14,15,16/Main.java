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


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter salary: ");
        double salary = sc.nextInt();


        Employee emp = new Employee(name,age,salary);
        System.out.println("\nEmployee Details: ");
        emp.displayEmployeeDetails();



    }
}
