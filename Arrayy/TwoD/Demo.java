package Arrayy.TwoD;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public List<Integer> sumOfEachRow(int arr[][]) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                sum += arr[row][col];
            }
            res.add(sum);
            sum = 0;
        }
        return res;
    }

    public List<Integer> sumOfEachCol(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                sum += arr[row][col];
            }
            res.add(sum);
            sum = 0;
        }
        return res;
    }

    public void printZigZag(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < m; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }

    public void transpoe(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[col][row] + " ");
            }
            System.out.println(" ");
        }
    }

    public int[][] rotate90Deg(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] res = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                res[row][col] = arr[col][row];
            }
        }
        return res;
    }

    public void spiral(int[][] arr) {
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int startRows = 0;
        int startColumns = 0;
        int endRows = totalRows - 1;
        int endColumns = totalCols - 1;

        while (startRows <= endRows && startColumns <= endColumns) {
            for (int col = startColumns; col <= endColumns; col++) {
                System.out.print(arr[startRows][col]);
            }
            startRows++;
            for (int row = startRows; row <= endRows; row++) {
                System.out.print(arr[row][endColumns]);
            }
            endColumns--;
            if (startRows <= endRows) {
                for (int col = endColumns; col >= startColumns; col--) {
                    System.out.print(arr[endRows][col]);
                }

                endRows--;
            }
            if (startColumns <= endColumns) {
                for (int row = endRows; row >= startRows; row--) {
                    System.out.print(arr[row][startColumns]);
                }
                startColumns++;
            }
        }
    }

    // MAIN************************************************************
    public static void main(String[] args) {
        Demo d = new Demo();
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        List<Integer> res = d.sumOfEachRow(arr);
        for (Integer i : res) {
            System.out.println(i);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<Integer> res2 = d.sumOfEachCol(arr);
        for (Integer i : res2) {
            System.out.println(i);
        }

        d.printZigZag(arr);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        d.transpoe(arr);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // int[][] res3 = d.rotate90Deg(arr);
        // for(int i = 0; i < res3.length; i++){
        // for (int j = res3.length-1; j >= 0; j--) {
        // System.out.print(res3[i][j]+" ");
        // }
        // System.out.println(" ");
        // }
        // for (int n = 0; n < res3.length; n++) {
        // int i = 0;
        // int j = res3.length - 1;
        // while (i < j) {
        // int temp = res3[n][i];
        // res3[n][i] = res3[n][j];
        // res3[n][j] = temp;
        // i++;
        // j--;
        // }
        // }
        // for (int i = 0; i < res3.length; i++) {
        // for (int j = 0; j < res3.length; j++) {
        // System.out.print(res3[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        int[][] arrr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        d.spiral(arrr);
    }
}
