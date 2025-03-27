import java.util.Scanner;

public class findAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        int avg = findAvg(arr);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Average value in the array is: " + avg);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }

    /**
     * This method finds the average value in the given array.
     * Time complexity: O(n), since it iterates through all elements once.
     *
     * @param arr The input array.
     * @return The average value in the array.
     */
    public static int findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return  sum / arr.length;
    }
}
