package Searching;

public class Search {
    public int BinarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mean = start+(end-start)/2;
        while(start <= end){
            mean = start + (end-start) / 2;
            if(arr[mean] == target){
                return mean;
            }
            else if(arr[mean] > target){
                end = mean-1;
            }
            else if(arr[mean] < target){
                start = mean + 1;
            }
        }
        return -1;
    }
}
