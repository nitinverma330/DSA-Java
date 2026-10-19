package Searching;

public class PeekIndex {
    public int FindPeek(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int peek = -1;
        int mean;
        while(start <= end){
            mean = start + (end-start) / 2;
            if(arr[mean] < arr[mean+1]){
                start = mean+1;
            }else{
                peek = mean;
                end = mean - 1;
            } 
        }
        return peek;
    }
}
