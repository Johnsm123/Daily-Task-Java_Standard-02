import java.util.Scanner;
import java.util.HashSet;
public class UserInterfaceDepart {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DepartmentGrouping departmentGrouping = new DepartmentGrouping();

            System.out.println("Enter the number of details");
            int count = 0;
            try {
                count = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number input");
                return;
            }

            if (count <= 0) {
                System.out.println(count + " is an invalid input");
                return;
            }

            System.out.println("Enter the details");
            for (int i = 0; i < count; i++) {
                String detail = sc.nextLine();
                departmentGrouping.addEmployeeId(detail);
            }

            HashSet<String> result = departmentGrouping.findDepartmentNameWithEmployeeId();
            if (result.isEmpty()) {
                System.out.println("All the provided employee ids are invalid");
            } else {
                for (String info : result) {
                    System.out.println(info);
                }
            }
        }
    }


