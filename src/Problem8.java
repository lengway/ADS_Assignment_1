import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();
        sc.close();

        double startTime = System.nanoTime();
        boolean result = isOnlyDigits(s);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        String res = (result ? "Yes" : "No");
        System.out.println("Is string contains only digits: " + res);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method checks string on containing symbols which are not digits.
     * Time complexity: O(n), because it checks every char once.
     *
     * @param s String to check for digits.
     */
    public static boolean isOnlyDigits(String s) {
        return s.matches("\\d+");
    }
}
