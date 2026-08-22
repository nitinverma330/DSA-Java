
class AvgArray{
    public void avg(int arr[]){
        int len = arr.length;
        int avg = 0;
        int sum = 0;
        for(int i=0; i < len ; i++){
            sum = sum + arr[i];
            avg = sum / len;
        }
        System.out.println(avg);
    }
}

class MultiArr{
    public void multiple(int arr[]){
        for(int i=0; i<arr.length; i++){
            int res = arr[i] * 10;
            System.out.println(res);
        }
    }
}


class LinearSearch{
    public boolean search(int[] arr,int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}

class MaxArrElement{
    void Max(int arr[]){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}


class sumPN{
    void sumOfNagativeAndPositive(int[] arr){
        int sumPositive =0;
        int sumNegetive = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>0){
                sumPositive = arr[i] + sumPositive;
            }else{
                sumNegetive = sumNegetive + arr[i];
            }
        }
        System.out.println(sumNegetive + " Negetive");
        System.out.println(sumPositive + " Positiv");
    }
}


class CountZERONE{
    int[] CountZEro(int[] arr){
        int Zero = 0;
        int One = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
            Zero++;
            }else{
                One++;
            }
        }
        int[] rs = {Zero,One};
        return rs;
    }
}


class ShortingELEFind{
    int FindElement(int[] arr){
        int incr = arr[0];
        int dec = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if(dec<arr[i]){
                dec = arr[i];
            }else if(incr>arr[i]){
                incr = arr[i];
            }
            else{
               return arr[i];
            }
        }
        return -1;
    }
}





class Day1{
    public static void main(String[] args) {
        int arr[] = {5,5,-22,2,7,-2,-6};
        int[] arr1 = {0,1,0,1,0,0,0,1,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1};
        int[] arr2 = {1,2,3,4,5,10,30,80,40,6,7,8};
        int[] arr3 = {100,90,89,88,66,55,10,50};
        AvgArray a = new AvgArray();
        // a.avg(arr);

        MultiArr mltiarr = new MultiArr();
        // mltiarr.multiple(arr);

        LinearSearch sec = new LinearSearch();
        // System.out.println(sec.search(arr, 77));

        MaxArrElement mx = new MaxArrElement();
        // mx.Max(arr);

        sumPN sum = new sumPN();
        // sum.sumOfNagativeAndPositive(arr);

        CountZERONE ZO = new CountZERONE();
        int[] res = ZO.CountZEro(arr1);
        // System.out.println("Zero " + res[0]);
        // System.out.println("One " + res[1]);
        ShortingELEFind ss = new ShortingELEFind();
        int ress = ss.FindElement(arr2);
        System.out.println(ress);
    }
}