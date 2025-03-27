import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close();

        double startTime = System.nanoTime();
        int result = fibonacci(number);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("The Fibonacci number is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the nth fibonacci number.
     * Time complexity: O(n^2), since it calls function twice with every single call.
     *
     * @param number The input number.
     * @return The nth fibonacci number.
     */
    public static int fibonacci(int number) {
        if (number < 2) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
