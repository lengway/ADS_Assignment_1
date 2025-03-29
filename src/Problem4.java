import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close();

        if (number < 0) {
            throw new IllegalArgumentException("Number must be a positive integer");
        }
        double startTime = System.nanoTime();
        long result = factorial(number);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Factorial of  " + number + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the factorial of the given number.
     * This is recursive function.
     * Time complexity: O(n), since it calls itself once a call.
     *
     * @param number The input number.
     * @return The factorial of the number.
     */
    public static long factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }

        return factorial(number - 1) * number;
    }
}
