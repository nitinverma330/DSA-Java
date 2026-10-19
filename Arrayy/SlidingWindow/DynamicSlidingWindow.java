import java.util.HashMap;

class Syntax {
    public int CountMax(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= target) {
                int leng = right - left + 1;
                maxLen = Math.max(maxLen, leng);

                sum -= left;
                left++;
            }
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;

    }

    // Longest Subarray With At Most K Zeros
    public int find_0ss(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int len = 0;
        while (right < n) {
            if(arr[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    //Minimum Length Subarray With Sum ≥ K
    public int MinLenSub(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < n; right++){
            sum += arr[right];
            while(sum >= k){
                sum -= arr[left];
                minLen = Math.min(minLen, right - left + 1);
                left++;
            }
        }
        return minLen;
    }
    public int Fruit(int[] arr, int k){
        int n = arr.length;
        int left = 0;
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while(map.size() > k){

                int leftEle = arr[left];
                map.put(leftEle, map.get(leftEle)-1);
                
                if(map.get(leftEle) == 0 ){
                    map.remove(leftEle);
                }
                left++;
            }
            len = Math.max(len, right - left + 1);            
        }
        return len;
    }
    //Longest Subarray With At Most 3 Odd Numbers
    public int AtMost3ODD(int arr[], int k){
        int n = arr.length;
        int left = 0;
        int count = 0;
        int len = Integer.MIN_VALUE;
        for(int right = 0; right < n; right++){

            if(arr[right] % 2 != 0){
                count++;
            }


            while(count > k){
                if(arr[left] % 2 != 0){
                    count--;
                }
                left++;
            }
            len = Math.max(len,right - left + 1);

        }
        return len;
    }
}

public class DynamicSlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        Syntax s = new Syntax();
        int res = s.CountMax(arr, 7);
        System.out.println(res);

        int[] arr2 = { 1, 0, 1, 0, 0, 1, 1, 1 };
        int res2 = s.find_0ss(arr2, 2);
        System.out.println(res2);

        int[] arr3 = {1,8,1,1,1,1};
        int res3 = s.MinLenSub(arr3,4);
        System.out.println(res3);

        int[] arr4 = {2,1,3,3,6,1,8,6};
        int res4 = s.AtMost3ODD(arr4,3);
        System.out.println(res4);
        
        int[] arr5 = {3,3,3,1,2,1,1,2,3,3,4};
        int res5 = s.Fruit(arr5,2);
        System.out.println(res5);
        
    }
}
