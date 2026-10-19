package Searching;
//Search in sorted 2D array by row
public class towDBinarySearch {
    public int find(int[][] arr, int target){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int n = totalRow * totalCol;
        int start = 0;
        int end = n-1;
        int mid = 0;
        while (start<=end) {
            mid = start + (end - start) / 2;
            int indexRow = mid / totalCol;
            int indexCol = mid % totalCol;

            if(arr[indexRow][indexCol] == target){
                return arr[indexRow][indexCol];
            }
            else if(arr[indexRow][indexCol] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
