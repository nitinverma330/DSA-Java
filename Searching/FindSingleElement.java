package Searching;

public class FindSingleElement {
    public int find (int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            
            int currentValue = arr[mid];
            int previousValue = -1;
            if(mid-1 >= 0){
                previousValue = arr[mid-1];
            }
            int nextValue = -1;
            if (mid+1 < n) {
                nextValue = arr[mid+1];
            }
            if (currentValue != previousValue && currentValue != nextValue) {
                return currentValue;
            }else if (currentValue != previousValue && currentValue == nextValue) {
                int startIndex = mid;
                if (startIndex % 2 == 0) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else if (currentValue == previousValue && currentValue != nextValue) {
                int endIndex = mid;
                if (endIndex % 2 == 0) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            // if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
            //     return mid;
            // }else if (arr[mid] == arr[mid-1]) {
            //     if(mid-1 % 2 == 0){
            //         start = mid+1;
            //     }else{
            //         end = mid-1;    
            //     }
            // }else if(arr[mid] == arr[mid+1]){
            //     if(mid % 2 != 0){
            //         end = mid-1;    
            //     }else{
            //         start = mid+1;
            //     }
            // }
        }
        return -1;
    }
}
