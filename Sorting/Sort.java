package Sorting;

public class Sort {
    public int[] BubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;//TC = O(n2) SC = O(1)
    }
    public int[] SelectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n-1; j++){
                if(arr[minIndex] < arr[j]){
                    minIndex = j;
                }
                if(j == n-1){
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;//TC = O(n2) SC = O(1)
    }
    public int[] InsertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int currentValue = arr[i];
            int previous = i-1;
            while(currentValue < arr[previous]){
                arr[previous+1] = arr[previous];
                previous--;
                if(currentValue > arr[previous]){
                    currentValue = arr[previous];
                }
            }
        }
        return arr;
    }
}
