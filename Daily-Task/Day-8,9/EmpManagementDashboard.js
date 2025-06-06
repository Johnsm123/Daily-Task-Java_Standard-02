// Store employee details
let employees = [];

// Function to add an employee
function addEmployee(name, role = "Associate", salary = 30000) {
  employees.push({ name, role, salary });
  console.log(` Added: ${name}, ${role}, ₹${salary}`);
}

// Function to display all employees (without exposing salary directly)
function listEmployees() {
  console.log(" Employee List:");
  employees.forEach((emp) => {
    console.log(`Name: ${emp.name}, Role: ${emp.role}`);
  });
}

// Function to get salary of a specific employee (controlled access)
function getSalary(name) {
  const emp = employees.find((e) => e.name === name);
  if (emp) {
    console.log(` Salary of ${name}: ₹${emp.salary}`);
  } else {
    console.log(` Employee ${name} not found.`);
  }
}

// Example usage:
addEmployee("Alice", "Manager", 75000);
addEmployee("Bob"); // Defaults to "Associate", ₹30000
listEmployees();
getSalary("Alice");
// getSalary("Bob"); // Uncomment to see Bob's salary
