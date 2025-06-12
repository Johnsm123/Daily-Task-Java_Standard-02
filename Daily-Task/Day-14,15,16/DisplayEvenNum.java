import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisplayEvenNum {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(8);
        numbers.add(23);
        numbers.add(4);
        numbers.add(12);
        numbers.add(31);
        numbers.add(6);
        numbers.add(27);
        numbers.add(10);
        numbers.add(2);


        Collections.sort(numbers);


        System.out.println("Sorted even numbers:");
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
