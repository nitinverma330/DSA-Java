package Searching;

public class BookAllocation {
    private boolean studentIsValid(int arr[], int k, int mean) {
        int std = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mean) {
                pages = pages + arr[i];
            } else{
                std++;
                if (std > k || arr[i] > mean) {
                    return false;
                }else{
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }

    public int bookAllocation(int[] arr, int k) {

        int n = arr.length;
        int minPages = 0;
        int sum = 0;
        if(k > n){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int mean = -1;
        int start = 0;
        int end = sum;
        while (start <= end) {
            mean = start + (end - start) / 2;
            if (studentIsValid(arr, k, mean)) {
                minPages = mean;
                end = mean - 1;
            } else {
                start = mean + 1;
            }
        }
        return minPages;
    }
}
