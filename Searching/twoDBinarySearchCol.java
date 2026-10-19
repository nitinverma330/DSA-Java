package Searching;
//Search in sorted 2D array by col
public class twoDBinarySearchCol {
    public int find(int[][] arr, int target){
        int totalCol = arr[0].length;
        int totalRow = arr.length;
        int row = 0;
        int col = totalCol-1;
        while(row < totalRow && col >= 0){
            if (arr[row][col] == target) {
                return arr[row][col];
            }else if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return -1;
    }
}
