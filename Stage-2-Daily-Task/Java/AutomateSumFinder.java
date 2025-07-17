import java.util.Arrays;
import java.util.Scanner;

public class AutomateSumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println(arr[i] + " is an invalid element");
                return;
            }
        }

        System.out.println("Enter the target sum value");
        int target = sc.nextInt();

        // Sorting the array
        Arrays.sort(arr);

        System.out.println("The sorted array is");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Pairs with sum " + target);
        boolean found = false;

        int left = 0;
        int right = size - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("None of the pair has the sum value as " + target);
        }
    }
}
