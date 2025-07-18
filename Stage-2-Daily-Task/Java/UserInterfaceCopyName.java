import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class UserInterfaceCopyName {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the starting character");
            char startChar = sc.next().charAt(0);

            int count = 0;

            try (
                    BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
                    FileWriter fw = new FileWriter("file2.txt");
            ) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty() && line.charAt(0) == startChar) {
                        fw.write(line + "\n");
                        count++;
                    }
                }

                if (count > 0) {
                    System.out.println(count + " names are added to the file2");
                } else {
                    System.out.println("No names found");
                }

            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


