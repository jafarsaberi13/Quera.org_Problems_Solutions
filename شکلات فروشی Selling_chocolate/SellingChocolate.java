import java.util.HashSet;
import java.util.Scanner;

public class Improving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long m = scanner.nextLong();
        long[] array = new long[n];

        // Reading array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }

        // Using a HashSet to track remainders of subset sums modulo m
        HashSet<Long> remainders = new HashSet<>();
        remainders.add(0L); // Initial remainder

        for (long value : array) {
            HashSet<Long> newRemainders = new HashSet<>();
            for (long remainder : remainders) {
                long newRemainder = (remainder + value) % m;
                if (newRemainder == 0) {
                    System.out.println("YES");
                    return;
                }
                newRemainders.add(newRemainder);
            }
            remainders.addAll(newRemainders);
        }

        System.out.println("NO");
    }
}