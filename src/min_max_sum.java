import java.util.*;

public class min_max_sum {
    public static void minMax(int[] arr)
    {
        // Initialize the min_value
        // and max_value to 0
        long min_value = 0;
        long max_value = 0;
        int n = arr.length;

        // Sort the array in descending order before calculating
        // min and max value
        Arrays.sort(arr);

        for (int i = 0, j = n - 1;
             i < n - 1; i++, j--)
        {
            // All elements except
            // rightmost will be added since the rightmost is the smallest
            min_value += arr[i];

            // All elements except
            // leftmost will be added since te leftmost element is the smallest
            max_value += arr[j];
        }

        // Output: min_value and max_value
        System.out.println(
                min_value + " "
                        + max_value);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Initialize your array elements here
        int[] arr = { 1, 3, 5, 7, 9};
        minMax(arr);
    }
}
