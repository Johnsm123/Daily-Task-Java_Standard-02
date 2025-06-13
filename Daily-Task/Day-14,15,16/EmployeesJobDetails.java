abstract class EmployeesJobDetails {
    protected String name;
    protected int id;

    public EmployeesJobDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends EmployeesJobDetails {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends EmployeesJobDetails {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

    class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000.0);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, 20.0, 80);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmp.displayDetails();

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmp.displayDetails();
    }
}