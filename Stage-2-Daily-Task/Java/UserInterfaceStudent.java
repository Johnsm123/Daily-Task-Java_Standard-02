import java.util.Scanner;
public class UserInterfaceStudent {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student studentObj = new Student();

            while (true) {
                System.out.println("1.Add");
                System.out.println("2.Display");
                System.out.println("3.Remove");
                System.out.println("4.Exit");
                System.out.println("Enter your choice");

                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    // invalid input, ignore and loop
                }

                switch (choice) {
                    case 1:
                        System.out.println("Enter the student name");
                        String nameToAdd = sc.nextLine();
                        studentObj.addStudentToList(nameToAdd);
                        break;

                    case 2:
                        if (studentObj.getStudentList().isEmpty()) {
                            System.out.println("The student list is empty");
                        } else {
                            studentObj.sortStudentList();
                            for (String student : studentObj.getStudentList()) {
                                System.out.println(student);
                            }
                        }
                        break;

                    case 3:
                        if (studentObj.getStudentList().isEmpty()) {
                            System.out.println("The student list is empty");
                        } else {
                            System.out.println("Enter the student name");
                            String nameToRemove = sc.nextLine();
                            studentObj.removeStudentFromList(nameToRemove);
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the application");
                        return;

                    default:
                        // Invalid option, do nothing as per problem spec
                        break;
                }
            }
        }
    }


