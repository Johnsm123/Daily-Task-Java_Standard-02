public class Students {
    private String studentId;
    private String studentName;
    private int percentageScore;

    // No-arg constructor
    public Students() {}

    // 3-arg constructor
    public Students(String studentId, String studentName, int percentageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.percentageScore = percentageScore;
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPercentageScore() {
        return percentageScore;
    }

    public void setPercentageScore(int percentageScore) {
        this.percentageScore = percentageScore;
    }

    @Override
    public String toString() {
        return "Student Id:" + studentId + "  Student Name:" + studentName + "  Score:" + percentageScore;
    }
}
