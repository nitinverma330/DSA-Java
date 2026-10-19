package Searching;

public class Painter {
    private boolean isValid(int arr[], int mean, int k){
        int painter = 1;
        int sum = -1;
        for(int i = 0; i < arr.length; i++){
            if (sum + arr[i] <= mean) {
                sum += arr[i];
            }else{
                painter++;
                if(painter > k || arr[i] > mean){
                    return false;
                }else{
                    sum = 0;
                    sum += arr[i];
                }
            }
        }
        return true;
    }
    public int painter(int arr[],int k){
        int n = arr.length;
        int start = 0;
        int sum = 0;
        int res = -1;
        if(k > n){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int end = sum;
        int mean = -1;
        while(start <= end){
            mean = start + (end - start) / 2;
            if(isValid(arr, mean, k)){
                res = mean;
                end = mean - 1;
            }else{
                start = mean + 1;
            }
        }
        return res;
    }
}
