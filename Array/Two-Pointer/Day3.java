
class Sort0s1s {
    public int[] sort(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }
}


class FindMissing{
    public int findMissing(int[] arr){
        int n = arr.length-1;
        int sumTotal = 0;
        int arraySum = 0;
        for(int i = 0; i <= n; i++){
            sumTotal = sumTotal + i;
            arraySum = arraySum + arr[i];
        }
        int result =  sumTotal-arraySum; 
        return result;
    }
}
class FindMissingXOR{
    public int findMissing(int[] arr){
        int n = arr.length-1;
        int sumTotal = 0;
        for(int i = 0; i <= n; i++){
            sumTotal = sumTotal ^ i;
            sumTotal = sumTotal ^ arr[i];
        }
        // int result =  sumTotal-arraySum;
        return sumTotal;
    }
}


class FindUnique{
    public int findUnique(int[] arr){
        int xor = 0;
        for(int n : arr){

            xor = xor ^ n;
        }
        return xor;
    }
}


class Sort0s1s2s{
    public int[] sorrt(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(mid<=end){
            if(arr[mid] == 0){
                int temp1 = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp1;
                mid++;
                start++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp2 = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp2;
                end--;
            }
        }
        return arr;
    }
}

public class Day3 {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0 };
        Sort0s1s sorttt = new Sort0s1s();
        int sorted[] = sorttt.sort(arr);
        for (int i : sorted) {
            System.out.print(i);
        }
        System.out.println("");

        
        int arr1[] = {0,1,2,3,0,4,5};
        
        FindMissing fm = new FindMissing();
        int res = fm.findMissing(arr1);
        System.out.println(res);
        
        FindMissingXOR fmm = new FindMissingXOR();
        int ress = fmm.findMissing(arr1);
        System.out.println(ress);

        int[] arr2 = {1,2,1,4,2,3,3,5,6,6,5};
        FindUnique xo = new FindUnique();
        int resss = xo.findUnique(arr2);
        System.out.println(resss);

        System.out.println("-----------------------");

        int[] arr3 = {0,0,2,0,1,0,2,1,2,0,1,2,2,0,1,0,0,2,0,2,0,1,0,1,1,2,0,1,2,2,1,1,0};
        int[] arr4 = {2,0,2,1,1,0};
        Sort0s1s2s s12 = new Sort0s1s2s();
        int[] ressss = s12.sorrt(arr4);
        for (int i : ressss) {
            System.out.print(i);
        }

    }
}
