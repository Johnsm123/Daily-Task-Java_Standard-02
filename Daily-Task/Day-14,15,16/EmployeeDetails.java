public class EmployeeDetails {
    String name;
    int age;
    double salary;
    String designation;

    public EmployeeDetails( String name, int age, double salary, String designation){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public void displayDetails(){
        System.out.println("Employee Details:");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Salary      : Rs." + salary);
        System.out.println("Designation : " + designation);
    }


}
