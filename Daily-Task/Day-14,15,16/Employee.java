public class Employee extends Person{

    double salary;
    Employee(String name, int age,double salary) {
        super(name, age);
        this.salary = salary;
    }

    void  displayEmployeeDetails(){
        displayPersonDetails();
        System.out.println("Salary: "+salary);
    }
}
