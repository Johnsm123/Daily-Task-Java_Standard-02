import java.io.*;
import java.util.ArrayList;

public class StudentNameList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Emma");
        students.add("Michael");
        students.add("Sarah");
        students.add("David");


        String fileName = "students.txt";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String name : students) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Student names written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nStudent names in uppercase:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
