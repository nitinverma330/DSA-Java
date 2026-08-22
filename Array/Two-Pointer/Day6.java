import java.util.ArrayList;
import java.util.List;

class Kadanes{
    public int kadanes (int[] arr){
        int n = arr.length;
        // List<Integer> sum = new ArrayList<>();
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
                sum = sum * arr[i];
                if(maxsum < sum){
                    maxsum = sum;
                   
                }
                if(sum < 0){
                    sum = 0;
                }
        }
        return maxsum;
    }


    public List<Integer> kadanesi (int[] arr){
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int f = 0;
        int e = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(maxsum < sum){
                maxsum = sum;
                e = i;
            }if(sum < 0){
                sum = 0;
                f = i+1;
            }
        }
        res.add(f);
        res.add(e);

        return res;
    }

        public List<Integer> kadanesmulti (int[] arr){
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        int e = 0;
        int f = 0;
        int maxproduct = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
                sum = sum * arr[i];
                if(maxproduct < sum){
                   maxproduct = sum;
                   e = i;
                }
                if(sum < 0){
                    sum = 1;
                    f = i+1;
                }
        }
        res.add(f);
        res.add(e);
        return res;
    }

}

public class Day6 {
    public static void main(String[] args) {
        
    
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    Kadanes k = new Kadanes();
    
    System.out.println("Total Sum : "+k.kadanes(arr));
    List<Integer> res = k.kadanesi(arr);
    System.out.print("Sub ARRAY : ");

    int f = res.get(0);
    int e = res.get(1);

    for(int i = f;i<=e;i++){
        System.out.print(arr[i] + " ");
    }


}}
