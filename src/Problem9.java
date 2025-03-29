import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        double startTime = System.nanoTime();
        int res = binomialCoefficient(n, k);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Binomial coefficient is " + res);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds a binomial coefficient using formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     * This is recursive function.
     * Time complexity: O(2^n), since it calls function twice with every single call.
     *
     * @param n The n parameter.
     * @param k The k parameter.
     * @return The binomial coefficient.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

}
