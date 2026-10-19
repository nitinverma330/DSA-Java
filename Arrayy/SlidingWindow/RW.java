import java.util.HashMap;

class Solution {
    public int[] pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int temp = 0;
        // for (i = 0; i < n; i++) {
            while (i < j) {
                if (arr[i] == 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                if (arr[j] == 0) {
                    j--;
                }
                i++;
            }
        // }
        return arr;
    }
}

public class RW {
    public static void main(String[] args) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(3, map.getOrDefault(3, 0) + 1);
        // map.put(3, map.getOrDefault(3, 0) + 1);
        // for (Integer i : map.keySet()) {
        // System.out.println(map.get(i));
        // }

        int[] arr = { 3, 5, 0, 0, 1, 0 };
        Solution s = new Solution();
        int[] ress = s.pushZerosToEnd(arr);
        for (int i : ress) {
            System.out.println(i);
        }
    }
}
