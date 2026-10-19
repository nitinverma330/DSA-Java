package Searching;
public class FindMaxOnesRow {
    public int findFirstIndex(int arr[][],int rowIndex){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int ans = -1;
        if(arr[rowIndex][totalCol-1] == 0){
            return totalCol;
        }else{
            int start = 0;
            int end = totalCol;
            while(start <= end){
                int mid = start+(end-start) / 2;
                if (arr[rowIndex][mid] == 0) {
                    start = mid+1;
                }else{
                    ans = mid;
                    end = mid-1;
                }
            }
        }
        return ans;
    }
    public int find(int arr[][]){
        int rowIndex = -1;
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int maxRow = 0;
        int totalOnes = 0;
        for(int i = 0; i < totalRow; i++){
            rowIndex = i;
            int first = findFirstIndex(arr, rowIndex);
            totalOnes = totalCol - first;
            maxRow = Math.max(totalOnes, maxRow);
        }
        return maxRow;
    }
}
