import java.util.*;
import java.util.stream.*;

public class StudentsUtility {
    private List<Students> studentList = new ArrayList<>();

    // Getter and setter
    public List<Students> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Students> studentList) {
        this.studentList = studentList;
    }

    // Convert list to stream
    public Stream<Students> convertToStream() {
        return studentList.stream();
    }

    // Filter students based on score
    public List<Students> filterStudentInfo(Stream<Students> studentStream, int score) {
        return studentStream
                .filter(s -> s.getPercentageScore() > score)
                .sorted(Comparator.comparingInt(Students::getPercentageScore).reversed())
                .collect(Collectors.toList());
    }
}
