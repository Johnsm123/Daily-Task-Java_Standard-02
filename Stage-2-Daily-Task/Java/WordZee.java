import java.util.Scanner;

public class WordZee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        // Check if the sentence contains only letters and spaces
        if (!sentence.matches("[a-zA-Z ]+")) {
            System.out.println(sentence + " is an invalid sentence");
            return;
        }

        System.out.println("Enter a word");
        String word = sc.nextLine();

        // Check if the word contains only letters
        if (!word.matches("[a-zA-Z]+")) {
            System.out.println(word + " is an invalid word");
            return;
        }

        // Split sentence to check if word is present as a whole word
        String[] words = sentence.split(" ");
        boolean found = false;
        for (String w : words) {
            if (w.equals(word)) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(word + " is not in the sentence");
            return;
        }

        // Reverse the word
        String reversed = new StringBuilder(word).reverse().toString();

        // Replace exact word match with reversed word
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            if (w.equals(word)) {
                result.append(reversed);
            } else {
                result.append(w);
            }
            result.append(" ");
        }

        // Print the modified sentence
        System.out.println(result.toString().trim());
    }
}
