import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number and a power:");
        String input = sc.nextLine();
        String[] parts =  input.split(" ");

        int number =  Integer.parseInt(parts[0]);
        int power = Integer.parseInt(parts[1]);

        double startTime = System.nanoTime();
        int result = pow(number, power);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("The " + number + " in power of " + power + "is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the given number in the given power using recursion.
     * Time complexity: O(n), since it calls function once with every single call.
     *
     * @param a The input number which we should power.
     * @param n The power.
     * @return The a^n.
     */

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return  a * pow(a, n - 1);
    }
}
