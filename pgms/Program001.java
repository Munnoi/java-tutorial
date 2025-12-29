// Second largest element in an array
package pgms;
import java.util.Arrays;

public class Program001 {
    static int getSecondLargest_v1(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = n - 2; i >= 0; i--)
            if (arr[i] != arr[n - 1])
                return arr[i];

        return -1;
    } 

    static int getSecondLargest_v2(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            return -1;
        return second;
    }

    public static void program() {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest_v2(arr));
    }
}