import java.util.ArrayList;
import java.util.List;

class Sw {
    public int MaxSubArray(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxsum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxsum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxsum = Math.max(maxsum, windowSum);
        }
        return maxsum;
    }

    public int MinSubArray(int[] arr, int k) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        min = windowSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            if (min > windowSum) {
                min = windowSum;
            }
        }
        return min;
    }

    public double AvgSubArray(int[] arr, int k) {
        int n = arr.length;
        double maxAvg = Integer.MIN_VALUE;
        double windowAvg = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            windowAvg = sum / k;
        }
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            windowAvg = sum / k;
            if (maxAvg < windowAvg) {
                maxAvg = windowAvg;
            }
        }
        return maxAvg;
    }

    public int CountWindow(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum > 15) {
            count++;
        }

        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            if (windowSum > 15) {
                count++;
            }
        }
        return count;
    }

    public int firstWindowSum(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum == 12) {
            return 0;
        }
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            if (windowSum == 12) {
                return i - 2;
            }
        }

        return -1;
    }

    public List<Integer> maxEle(int[] arr, int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        int maxEle = arr[0];

        for (int i = 0; i < k; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
                res.add(arr[i]);
            }
        }
        maxEle = 0;
        for (int i = k; i < n; i++) {
            if (arr[i - 2] > arr[i] && arr[i - 2] > arr[i - 1]) {
                maxEle = arr[i - 2];
                res.add(arr[i - 2]);
            } else if (arr[i - 1] > arr[i - 2] && arr[i - 1] > arr[i]) {
                maxEle = arr[i - 1];
                res.add(arr[i - 1]);
            } else {
                maxEle = arr[i];
                res.add(arr[i]);
            }
        }
        return res;
    }

    public List<Integer> maxEle2(int[] arr, int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i <= n - k; i++) {
            int maxEle = arr[0];
            for (int j = i; j < i + k; j++) {
                if (maxEle < arr[j]) {
                    maxEle = arr[j];
                }
            }
            res.add(maxEle);
        }
        return res;
    }
    // Maximum number of 1s in a window of size k
    public int count1s(int arr[], int k){
        return k;
    }
}

public class SlidingWindow {
    public static void main(String[] args) {

        int[] max = { 2, 1, 15, 3, 2, 10 };
        Sw sw = new Sw();
        int res = sw.MaxSubArray(max, 3);
        System.out.println(res);

        int[] min = { 4, 2, 7, 1, 3, 6 };
        int minres = sw.MinSubArray(min, 3);
        System.out.println(minres);

        int[] avg = { 1, 12, -5, -6, 50, 3 };
        double res_avg = sw.AvgSubArray(avg, 4);
        System.out.println(res_avg);

        int[] count = { 3, 6, 2, 8, 5, 1, 7 };
        int resCount = sw.CountWindow(count, 3);
        System.out.println(resCount);

        int[] firstARR = { 1, 4, 6, 2, 5, 3 };
        int resFisrt_index = sw.firstWindowSum(firstARR, 3);
        System.out.println(resFisrt_index);

        int[] lstARR = { 1, 3, -1, -3, 5, 3, 6, 7 };
        List<Integer> resLst = sw.maxEle(lstARR, 3);
        for (Integer i : resLst) {
            System.out.print(i);
        }
        System.out.println(" ");
    
        List<Integer> resLst2 = sw.maxEle2(lstARR, 3);
        for (Integer i : resLst2) {
            System.out.print(i);
        }
    }
}
