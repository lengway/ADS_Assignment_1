import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close();

        double startTime = System.nanoTime();
        boolean result = isPrime(number);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        String res = (result ? "Prime " : "Not Prime ");
        System.out.println("Number " + number + " is " + res);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }

    /**
     * This method finds is given number prime.
     * Time complexity: O(n), since it iterates through all elements once.
     *
     * @param number The input number.
     * @return The boolean answer.
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
