package Searching;

class AggressiveCow {
    private boolean isValid(int arr[], int k, int mean) {
        int cow = 1;
        int dis = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            dis = arr[i] - arr[end];
            if (dis >= mean) {
                cow++;
                end = i;
                if (cow == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public int cow(int arr[], int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mean = -1;
        int res = -1;
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