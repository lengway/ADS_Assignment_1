import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close();

        double startTime = System.nanoTime();
        int result = factorial(number);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Factorial of  " + number + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }

    /**
     * This method finds the factorial of the given number.
     * Time complexity: O(n), since it iterates through all elements once.
     *
     * @param number The input number.
     * @return The factorial of the number.
     */
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return factorial(number - 1) * number;
    }
}
