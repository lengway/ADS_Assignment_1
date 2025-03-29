import java.util.Scanner;

public class HRStringMingling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String a = sc.nextLine();
        System.out.println("Enter the second string:");
        String b = sc.nextLine();
        sc.close();

        double startTime = System.nanoTime();
        String result = stringMingling(a, b);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("The result is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
    * Task from HackerRank
     */

    public static String stringMingling(String a, String b) {
        StringBuilder result = new StringBuilder(a.length() * 2);
        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        return result.toString();
    }
}
