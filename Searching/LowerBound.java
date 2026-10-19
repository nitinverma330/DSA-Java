package Searching;

public class LowerBound {
    public int Lowerbound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int res = 0;
        while(start < end){
            int mean = start + (end-start) / 2;
            if(arr[mean] >= target){
                res = mean;
                end = mean - 1;
            }else if(arr[mean] < target){
                start = mean + 1;
            }
            
        }//1 2 2 3 3 3 3 34 4
        return res;
    }
}
