import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        sc.close();

        double startTime = System.nanoTime();
        int res = findGCD(a, b);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("The GCD of " + a + " and " + b + " = " + res);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    static int findGCD(int a, int b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }
}
