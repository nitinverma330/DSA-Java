package Searching;

public class FindSqrtRoot {
    public int findSqrt(int x){
        int sqrt = 0 ;
        int start = 0;
        int end = x;
        int mean = -1;
        while(start <= end){
            mean = start + (end - start) / 2;
            if(mean > x / mean){
                end = mean-1;
            }else if(mean < x / mean){
                sqrt = mean;
                start = mean + 1;
            }else{
                sqrt = mean;
            }
        }
        return sqrt;
    }
}
