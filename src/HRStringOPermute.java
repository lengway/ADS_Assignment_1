import java.util.Arrays;
import java.util.Scanner;

public class HRStringOPermute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }

        System.out.println("Enter the strings: ");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        double startTime = System.nanoTime();
        String[] strings = stringOPermute(arr);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("The permuted strings are: " + Arrays.toString(strings));
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }

    public static String[] stringOPermute(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);

            for (int j = 0; j < sb.length() - 1; j += 2) {
                char temp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(j + 1));
                sb.setCharAt(j + 1, temp);
            }

            result[i] = sb.toString();
        }

        return result;
    }
}
