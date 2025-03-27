import java.util.Scanner;

public class primeOrComposite {
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
     * This method finds the average value in the given array.
     * Time complexity: O(n), since it iterates through all elements once.
     *
     * @param number The input number.
     * @return The average value in the array.
     */
    public static boolean isPrime(int number) {
        int[] arr = new int[number];

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
