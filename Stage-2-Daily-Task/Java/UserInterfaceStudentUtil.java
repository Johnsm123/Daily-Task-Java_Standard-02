import java.util.*;
public class UserInterfaceStudentUtil {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentsUtility utility = new StudentsUtility();
            List<Students> students = new ArrayList<>();

            System.out.println("Enter the number of students:");
            int n = Integer.parseInt(sc.nextLine());

            if (n <= 0) {
                System.out.println("Invalid number of students");
                return;
            }

            System.out.println("Enter the student details:");
            for (int i = 0; i < n; i++) {
                String input = sc.nextLine();
                String[] parts = input.split("/");

                if (parts.length != 3) continue;

                String id = parts[0];
                String name = parts[1];
                int score = Integer.parseInt(parts[2]);

                students.add(new Students(id, name, score));
            }

            utility.setStudentList(students);

            System.out.println("Enter the score to search:");
            int scoreLimit = Integer.parseInt(sc.nextLine());

            List<Students> filtered = utility.filterStudentInfo(utility.convertToStream(), scoreLimit);

            if (filtered.isEmpty()) {
                System.out.println("No Student found");
            } else {
                System.out.println("Filtered student info whose score is above " + scoreLimit + ":");
                for (Students s : filtered) {
                    System.out.println(s.toString());
                }
            }
        }
    }


