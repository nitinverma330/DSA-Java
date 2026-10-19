package Searching;

public class FindInAlmostSortedArray {
    public int find(int arr[], int k){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            }else if (arr[mid-1] >= 0 && arr[mid-1] == k) {
                return mid;
            }else if (arr[mid+1] < n && arr[mid+1] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                start = mid+2;
            }else{
                end = mid-2;
            }
        }
        return -1;
    }
}
