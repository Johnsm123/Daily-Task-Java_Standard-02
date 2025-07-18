import java.util.HashSet;

public class DepartmentGrouping {
    private HashSet<String> employeeSet = new HashSet<>();

    // Getter
    public HashSet<String> getEmployeeSet() {
        return employeeSet;
    }

    // Setter
    public void setEmployeeSet(HashSet<String> employeeSet) {
        this.employeeSet = employeeSet;
    }

    // Requirement 1: Add valid employee IDs
    public void addEmployeeId(String details) {
        // Format: ID:Name (e.g., P567:Paul)
        String[] parts = details.split(":");
        if (parts.length == 2) {
            String empId = parts[0];
            if (empId.matches("[PQMS]\\d{3}")) {
                employeeSet.add(empId);
            }
        }
    }

    // Requirement 2: Find Department Names
    public HashSet<String> findDepartmentNameWithEmployeeId() {
        HashSet<String> departmentInfoSet = new HashSet<>();

        for (String empId : employeeSet) {
            char prefix = empId.charAt(0);
            String dept = "";

            switch (prefix) {
                case 'P':
                    dept = "Product";
                    break;
                case 'Q':
                    dept = "Quality Control";
                    break;
                case 'M':
                    dept = "Maintenance";
                    break;
                case 'S':
                    dept = "Sales";
                    break;
            }

            if (!dept.equals("")) {
                departmentInfoSet.add(empId + ":" + dept);
            }
        }
        return departmentInfoSet;
    }
}
