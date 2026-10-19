package Searching;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Search s = new Search();
        int arr[] = {1,2,5,6,7,8,9,10,15,20};

        int res = s.BinarySearch(arr, 8);
        System.out.println(res);

        int arr2[] = {10,20,20,30,30,30,30,30,40,40,50,60};
        LowerBound lb = new LowerBound();
        int res2 = lb.Lowerbound(arr2, 30);
        System.out.println("lower index "+res2);
        
        UpperBound ub = new UpperBound();
        int res3 = ub.Upperbound(arr2, 30);
        System.out.println("upper index "+res3);
        // System.out.println(res3 - res2);

        NoOfOccurence NOO = new NoOfOccurence();
        int res4 = NOO.NoOfOccurencee(arr2, 30);
        System.out.println("NoOfOccurence "+res4);

        int[] arr3 = {0,2,4,6,8,10,5,3,1};
        PeekIndex peek = new PeekIndex();
        int res5 = peek.FindPeek(arr3);
        System.out.println("PeekIndex "+res5);

        int arr4[] = {50,60,70,10,20,30,40};
        PivotIndex pi = new PivotIndex();
        int res6 = pi.Search(arr4,40);
        System.out.println("pivot index "+res6);

        int num = 56;
        FindSqrtRoot sqrt = new FindSqrtRoot();
        int res7 = sqrt.findSqrt(num);
        System.out.println("square root of "+num + " is "+res7);

        
        int arr5[] = {12, 34, 67, 90};
        BookAllocation book = new BookAllocation();
        int res8 = book.bookAllocation(arr5, 4);
        System.out.println("Min pages alottes is " + res8 );

        int arr6[] = {5, 10, 30, 20, 15};
        Painter ptr = new Painter();
        int res9 = ptr.painter(arr6, 3);
        System.out.println("Min time to paint is " + res9 );

        
        int arr7[] = {1, 2, 4, 8, 9};
        AggressiveCow cw = new AggressiveCow();
        int res10 = cw.cow(arr7, 3);
        System.out.println("Maximum Min distence of cow " + res10);

        int arr8[] = {20, 15, 10, 17};
        ECO_SPOJ ec = new ECO_SPOJ();
        int res11 = ec.eco(arr8, 7);
        System.out.println("Maximum Length of Sawblade " + res11);

        int arr9[] = {1, 2, 3, 4};
        Paratha pt = new Paratha();
        int res12 = pt.paratha(arr9, 10, 4);
        System.out.println("Min time taken by sheff " + res12);
  
        int arr10[] = {3,5,10,9,11};
        FindInAlmostSortedArray find = new FindInAlmostSortedArray();
        int res13 = find.find(arr10, 11);
        System.out.println("Element is on index : " + res13);

        int arr11[] = {1,2,2,3,3,4,4,5,5,6,6};
        FindSingleElement find1 = new FindSingleElement();
        int res14 = find1.find(arr11);
        System.out.println("Find Single Element is on index : " + res14);

        int arr12[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        towDBinarySearch find2 = new towDBinarySearch();
        int res15 = find2.find(arr12,8);
        System.out.println("Element is here 2D sorted Row wise : " + res15);

        int arr13[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        twoDBinarySearchCol find3 = new twoDBinarySearchCol();
        int res16 = find3.find(arr13,8);
        System.out.println("Element is here 2D sorted Column wise : " + res16);
        
        int arr14[][] = {{0,1,1,1},{0,0,1,1},{0,0,0,1},{1,1,1,1}};
        FindMaxOnesRow find4 = new FindMaxOnesRow();
        int res17 = find4.find(arr14);
        System.out.println("Element is here 2D sorted Column wise : " + res17);

        // ArrayList<Integer> arr15 = new ArrayList<Integer>();
        int arr15[] = new int[20001];
        for(int i = 0; i <= 20000; i++){
            arr15[i] = i;
        }

        UnboundedSearch find5 = new UnboundedSearch();
        int res18 = find5.find(arr15, 200);
        System.out.println("Element Founded at index : " + res18);
    }
}
