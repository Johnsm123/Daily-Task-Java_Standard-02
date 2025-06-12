import java.io.IOException;

public class CheckedException{
    public static void processData(String data) throws IOException {
        if (data == null) {
            throw new IOException("Input data is null");
        }
        System.out.println("Processing data: " + data);
    }

    // Calling method that handles the exception
    public static void main(String[] args) {
        try {
            processData(null); // This will throw IOException
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        // Test with valid data
        try {
            processData("Valid Data");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
