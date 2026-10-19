package Arrayy.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

class reverseArr {
    public void revs(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}

class ShiftByOne {
    public void shiftt(int arr[]) {
        int lastEle = arr.length;
        int temp = arr[lastEle - 1];
        for (int i = lastEle - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}

class ShiftByK {
    public int[] shiftByK(int arr[], int k) {
        int lastElement = arr.length;
        k = k % lastElement;
        int newArr[] = Arrays.copyOfRange(arr, lastElement - k, lastElement);
        for (int i = lastElement - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = newArr[i];
        }
        return arr;
    }
}

class Alter {
    public void printAlter(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        // for(i=0;i<=j;i++){
        // if(i==j){
        // System.out.print(arr[i]+" ");
        // }else{
        // System.out.print(arr[i]+" "+arr[j]+" ");
        // }
        // j--;
        // }

        // OR
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " " + arr[j] + " ");
                i++;
                j--;
            }
        }
    }
}

class FindMode {
    public void findMode(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        int highEle = 0;
        int highFri = Integer.MIN_VALUE;
        int lowEle = 0;
        int lowFri = Integer.MAX_VALUE;
        for (int n : arr) {
            nums.put(n, nums.getOrDefault(n, 0) + 1);
            int currentKey = n;
            int currentFreque = nums.get(n);
            if (currentFreque > highFri) {
                highFri = currentFreque;
                highEle = currentKey;
            }

        }
        for (int n : nums.keySet()) {

            int currentKey = n;
            int currentFreque = nums.get(n);
            if (currentFreque < lowFri) {
                    lowEle = currentKey;
                    lowFri = currentFreque;
            }

        }
        
        System.out.println("Highest friquency Element => " + highEle + " " + highFri);
        System.out.println("lowest friquency Element => " + lowEle + " " + lowFri);

    }
}

public class Day2 {
    public static void main(String[] args) {
        int[] arr = {5,5,5,1,1,1,1,2,2,3,4 };
        reverseArr rs = new reverseArr();
        // rs.revs(arr);

        ShiftByOne shi = new ShiftByOne();
        // shi.shiftt(arr);
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }

        ShiftByK sk = new ShiftByK();
        // int res[] = sk.shiftByK(arr, 4);
        // for (int i : res) {
        // System.out.print(i+" ");
        // }

        Alter alter = new Alter();
        // alter.printAlter(arr);

        FindMode findmode = new FindMode();
        findmode.findMode(arr);

    }
}
