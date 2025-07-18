public class StudentCGPAManager {
    // Student.java
    public class Student {
        private String studentName;
        private String registerNumber;
        private String collegeName;
        private String emailId;
        private double cgpa;

        public String getStudentName() { return studentName; }
        public void setStudentName(String studentName) { this.studentName = studentName; }

        public String getRegisterNumber() { return registerNumber; }
        public void setRegisterNumber(String registerNumber) { this.registerNumber = registerNumber; }

        public String getCollegeName() { return collegeName; }
        public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

        public String getEmailId() { return emailId; }
        public void setEmailId(String emailId) { this.emailId = emailId; }

        public double getCgpa() { return cgpa; }
        public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    }

    // CGPAInvalidException.java
    public class CGPAInvalidException extends Exception {
        public CGPAInvalidException(String message) {
            super(message);
        }
    }

// CgpaManipulation.java
import java.util.*;

    public class CgpaManipulation {
        private List<Student> studentList = new ArrayList<>();

        public List<Student> getStudentList() {
            return studentList;
        }

        public void setStudentList(List<Student> studentList) {
            this.studentList = studentList;
        }

        public boolean validateStudentCgpa(double cgpa) throws CGPAInvalidException {
            if (cgpa >= 1.0 && cgpa <= 10.0) return true;
            else throw new CGPAInvalidException("Invalid Student Cgpa");
        }

        public void addStudentDetails(String studentName, String registerNumber, String collegeName, String emailId, double cgpa) {
            Student s = new Student();
            s.setStudentName(studentName);
            s.setRegisterNumber(registerNumber);
            s.setCollegeName(collegeName);
            s.setEmailId(emailId);
            s.setCgpa(cgpa);
            studentList.add(s);
        }

        public List<Student> viewStudentDetails(double cgpa) {
            List<Student> result = new ArrayList<>();
            for (Student s : studentList) {
                if (s.getCgpa() >= cgpa) {
                    result.add(s);
                }
            }
            return result;
        }
    }

// UserInterface.java
import java.util.*;

    public class UserInterface {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CgpaManipulation cm = new CgpaManipulation();

            System.out.println("Enter Number of Registrations");
            int n = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the Registration Details " + i);
                String[] input = sc.nextLine().split(":");
                String studentName = input[0];
                String registerNumber = input[1];
                String collegeName = input[2];
                String emailId = input[3];
                double cgpa = Double.parseDouble(input[4]);
                try {
                    if (cm.validateStudentCgpa(cgpa)) {
                        cm.addStudentDetails(studentName, registerNumber, collegeName, emailId, cgpa);
                    }
                } catch (CGPAInvalidException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Enter the CGPA need to be searched");
            double searchCgpa = Double.parseDouble(sc.nextLine());
            List<Student> res = cm.viewStudentDetails(searchCgpa);
            if (res.isEmpty()) {
                System.out.println("No Registration found");
            } else {
                for (Student s : res) {
                    System.out.println("Student Name " + s.getStudentName());
                    System.out.println("Register Number " + s.getRegisterNumber());
                    System.out.println("College Name " + s.getCollegeName());
                    System.out.println("Email Id " + s.getEmailId());
                }
            }
        }
    }

}
