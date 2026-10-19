package Sorting;

public class Main {
    public static void main(String[] args) {
        Sort IS = new Sort();
        int[] arr = {5,6,8,1,3,2,4,7,9};
        int[] res = IS.BubbleSort(arr);
        System.out.print("BubbleSort    :- ");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int[] res2 = IS.SelectionSort(arr);
        System.out.print("SelectionSort :- ");
        for (int i : res2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int[] res3 = IS.InsertionSort(arr);
        System.out.print("InsertionSort :- ");
        for (int i : res3) {
            System.out.print(i + " ");
        }
    }
}
