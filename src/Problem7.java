import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println("Enter the integers:");
        reverseInput(n, sc);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method prints the given array in the reverse order using recursion.
     * Time complexity: O(n), since it calls function once with every single call.
     *
     * @param n Amount of numbers to input.
     * @param sc Just scanner.
     */
    public static void reverseInput(int n, Scanner sc) {
        if (n == 0) {
            return;
        }

        int num = sc.nextInt();
        reverseInput(n - 1, sc);
        System.out.print(num + " ");
    }
}
