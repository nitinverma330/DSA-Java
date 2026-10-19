package Searching;

public class PivotIndex {
    //Find Pivot index 
    public int pivotIndex(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mean;
        int ans = -1;
        if(arr[start] < arr[end]){
            return -1;
        }
        while(start <= end){
            mean = start + (end-start) / 2;
            if(arr[mean] <= arr[n-1]){
                end = mean-1;
            }else{
                ans = mean;
                start = mean+1;
            }
        }
        return ans;
    }
    //Find Element
    public int Search(int arr[],int target){
        int n =arr.length;
        int start = 0;
        int end = n - 1;
        int mean = -1;
        int pivot = pivotIndex(arr);
        if(arr[start] < arr[end]){
            return -1;
        }else if(arr[0] > target){
            start = pivot + 1;
            end = n - 1;
        }else if(target >= arr[0]){
            start = 0;
            end = pivot;
        }
        while(start <= end){
            mean = start + (end - start) / 2;
            if(arr[mean] == target){
                return mean;
            }else if(arr[mean] < target){
                start = mean + 1;
            }else{
                end = mean - 1;
            }
        }
        return -1;
    }

}
