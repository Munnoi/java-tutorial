// Third largest element in an array
package pgms;
import java.util.Arrays;

public class Program003 {
    static int thirdLargest_v1(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 3];
    }

    static int thirdLargest_v2(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        if (third == Integer.MIN_VALUE)
            return -1;
        return third;
    }
    public static void program() {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest_v2(arr));
    } 
}
