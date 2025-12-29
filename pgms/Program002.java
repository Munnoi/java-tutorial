// Reverse an array
package pgms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program002 {
    static void reverseArray_v1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void reverseArray_v2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    static void reverseArray_v3(List<Integer> arr) {
        Collections.reverse(arr);
    }

    static void displayArray(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    } 

    public static void program() {
        // int[] arr = {1, 4, 3, 2, 6, 5};
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
        reverseArray_v3(arr);
        displayArray(arr);
    }
}
