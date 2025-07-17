import java.util.Scanner;

class SquareIncrementSequence {
    // Attribute to store the starting number
    private int startNumber;

    // Method to set the starting number
    public void setStartNumber(int number) {
        this.startNumber = number;
    }

    // Method to generate and print the square increment sequence
    public void generateSequence() {
        System.out.println("Required Square Increment Sequence");
        for (int i = 0; i < 11; i++) { // Changed to 11 iterations
            int currentNumber = startNumber + i;
            int squareIncrement = (currentNumber * currentNumber) + 1;
            System.out.print(squareIncrement);
            // Print space after each number except the last one
            if (i < 10) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt user for input
        System.out.println("Enter the first number");
        int input = sc.nextInt();

        // Create object of SquareIncrementSequence class
        SquareIncrementSequence sequence = new SquareIncrementSequence();
        sequence.setStartNumber(input);
        sequence.generateSequence();

        sc.close();
    }
}