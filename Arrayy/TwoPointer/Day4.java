package Arrayy.TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class TwoSum {
    public int[] getSUM(int[] arr, int target) {
        // int i = 0;
        // int j = 0;
        int firstInd = 0;
        int secondInd = 0;
        // while(i<arr.length-2){
        // int res = arr[i] + arr[j];
        // if(res != target){
        // j++;
        // }else if(j == arr.length-1){
        // i++;
        // j = i;
        // }if(res == target){
        // firstInd = i;
        // secondInd = j;
        // }
        // }

        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int res = arr[i] + arr[j];
                if (res == target) {
                    firstInd = i;
                    secondInd = j;
                }
            }
        } // O(n2) O(1)
        int output[] = { firstInd, secondInd };
        return output;
    }
}

class ThreeSum {
    public List<Integer> getSUM(int[] arr, int target) {

        HashSet<Integer> arr1 = new HashSet<>();
        for (int ele : arr) {
            arr1.add(ele);
        }

        List<Integer> arr2 = new ArrayList<>(arr1);

        int firstInd = 0;
        int secondInd = 0;
        int thirdInd = 0;

        int n = arr2.size() - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int res = arr2.get(i) + arr2.get(j) + arr2.get(k);
                    if (res == target) {
                        firstInd = arr2.get(i);
                        secondInd = arr2.get(j);
                        thirdInd = arr2.get(k);
                    }
                }
            }
        } // O(n3) O(1)
        List<Integer> output = new ArrayList<>();
        output.add(firstInd);
        output.add(secondInd);
        output.add(thirdInd);
        return output;
    }
}

class RemoveDuplicate {
    public int removee(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length - 1;
        while (j <= n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
        // Set<Integer> sort = new HashSet<>();

        // for (int i : nums) {
        // sort.add(i);
        // }

        // return sort;
    }
}

class Repeated {
    public int repeat(int[] arr) {
        HashMap<Integer, Integer> ress = new HashMap<>();
        int i = 0;
        int count = 1;
        for (i = 0; i < arr.length; i++) {
            if (ress.containsKey(arr[i])) {
                count++;
                ress.put(arr[i], count);
            } else {
                count = 1;
                ress.put(arr[i], count);
            }
        }
        for (int k : ress.keySet()) {
            int n = ress.get(k);
            if (n > 1) {
                return k;
            }
        }

        // while(j<arr.length-1){
        // if(arr[i] == arr[j]){
        // res = arr[i];
        // }else if(j == arr.length-1){
        // i++;
        // }
        // }
        return 0;
    }
}

// find Pivot index = index who have left sum = right sum
// class Pivot {
//     public int pivot(int[] arr){
//         int n = arr.length;
//         int arr1[] = new int[n];
//         int arr2[] = new int[n];

//         for(int i = 1; i < n-1; i++){
//             arr1[i] = arr[i] + arr[i-1];
//         }
//         for(int i = n-1; i > 0 ; i--){
//             arr2[i] = arr[i] + arr[i+1];
//         }
//         for (int i = 0; i<n-1;i++) {
//             if(arr1[i] == arr2[i]){
//                 return i ;
//             }            
//         }
//         return 0;
//     }
// }


class Pivot {
    public int pivot(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length;i++){
            total += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightSUM = total - leftSum - arr[i];
            if(leftSum == rightSUM){
                return i;
            }
            leftSum += arr[i];
        }// O(n) O(1)

        return -1;
    }
}

public class Day4 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 15, 7, 6, 15, 7, 10, 12 };
        // int target = 15;
        // TwoSum ts = new TwoSum();
        // int[] res = ts.getSUM(arr, target);
        // System.out.println("first element :- " + res[0] + " Second Element -: " +
        // res[1]);

        // ThreeSum tss = new ThreeSum();
        // List<Integer> ress = tss.getSUM(arr, target);
        // System.out.println(ress.toString());

        // int ddd[] = {1,1,1,2,2,3,3,4,4,5};
        // RemoveDuplicate rd = new RemoveDuplicate();
        // Set<Integer> resss = rd.remove(ddd);
        // int resss = rd.removee(ddd);
        // System.out.println(resss);

        Repeated re = new Repeated();
        // System.out.print(re.repeat(arr));

        // HashMap<Integer,Integer> ree = re.repeat(arr);
        // for (int n : ree.keySet()){
        // System.out.println(ree.get(n));
        // }

        int rrr[] = {1,2,3,4,5,1};
        Pivot p = new Pivot();
        System.out.println(p.pivot(rrr));

    }
}
