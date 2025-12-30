package pgms;

public class Program005 {
    static void rotate_v1(int[] arr, int d) {
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    static void rotate_v2(int[] arr, int d) {
        int n = arr.length;
        d %= n; // Handle cases where d is greater than n
        int[] temp = new int[n];

        // Copy the last n - d elements to temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i + d];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        // Copy temp to arr
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    static void rotate_v3(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void program() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 3;

        rotate_v3(arr, d);

        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
