package Searching;

public class ECO_SPOJ {
    private int fintmax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private boolean isValid(int arr[], int k, int mean) {
        int n = arr.length;
        int res = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= mean) {
                res = arr[i] - mean;
                sum += res;
            }
        }
        if (k <= sum) {
            return true;
        }
        return false;
    }

    public int eco(int[] arr, int k) {
        int start = 0;
        int end = fintmax(arr);
        int mean = 0;
        int res = 0;
        while (start <= end) {
            mean = start + (end - start) / 2;
            if (isValid(arr, k, mean)) {
                res = mean;
                start = mean + 1;
            } else {
                end = mean - 1;
            }
        }
        return res;
    }
}
