import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private List<String> studentList = new ArrayList<>();

    // Getter
    public List<String> getStudentList() {
        return studentList;
    }

    // Setter
    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }

    // Requirement 1: Add student to the list
    public void addStudentToList(String student) {
        studentList.add(student);
    }

    // Requirement 2: Sort the list alphabetically
    public void sortStudentList() {
        Collections.sort(studentList);
    }

    // Requirement 3: Remove a student from the list
    public void removeStudentFromList(String student) {
        studentList.remove(student);
    }
}

