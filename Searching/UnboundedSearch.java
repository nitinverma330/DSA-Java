package Searching;

public class UnboundedSearch {
    public int find(int arr[], int target) {
        if(arr[0] == target){
            return 0;
        }
        int i = 1;
        while(arr[i] <= target){
            i = i * 2;
        }
        if(arr[i] > target){
            int start = i/2;
            int end = i;
            while (start<=end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return arr[mid];
                }
                if(arr[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
