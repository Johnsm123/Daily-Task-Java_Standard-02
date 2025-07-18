import java.util.Scanner;
public class UserInterfaceWordSum {


        // Static method using lambda to compute ASCII sum and check for perfection
        public static WordSummarizer calculateAsciiSum() {
            return (String word) -> {
                int sum = 0;
                for (int i = 0; i < word.length(); i++) {
                    sum += (int) word.charAt(i);
                }
                if (sum % 2 == 0) {
                    return word + " is a perfect word";
                } else {
                    return word + " is not a perfect word";
                }
            };
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the word to find the sum:");
            String word = sc.nextLine();

            // Validate input: should contain only letters and spaces
            if (!word.matches("[a-zA-Z ]+")) {
                System.out.println(word + " is a invalid word");
            } else {
                WordSummarizer summarizer = calculateAsciiSum();
                String result = summarizer.summarize(word);
                System.out.println(result);
            }
        }
    }


