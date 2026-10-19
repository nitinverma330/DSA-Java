package Arrayy.TwoPointer;

import java.util.ArrayList;
import java.util.List;

class Missing{
    public List<Integer> missing(int[] arr){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length;i++) {
            int Value = Math.abs(arr[i]);
            int pose = Value-1;
            if(arr[pose]>0){
                arr[pose] = -arr[pose];
            }
        }
        for (int i = 0; i< arr.length;i++) {
            if(arr[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}


public class Day5 {
    public static void main(String[] args) {   
        int[] arr = {2,4,5,5,6,5,1,3,2,3};
        Missing m = new Missing();
        List<Integer> res = m.missing(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
