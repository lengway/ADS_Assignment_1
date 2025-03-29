import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        double startTime = System.nanoTime();
        int min = findMin(arr);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the minimum value in the given array.
     * Time complexity: O(n), since it iterates through all elements once.
     *
     * @param arr The input array.
     * @return The minimum value in the array.
     */
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
