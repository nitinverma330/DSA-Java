package Searching;

public class NoOfOccurence {
    public int NoOfOccurencee(int arr[] , int target){
        LowerBound l = new LowerBound();
        UpperBound u = new UpperBound();
        int l_index = l.Lowerbound(arr, target);
        int u_index = u.Upperbound(arr, target);
        int res = u_index - l_index;
        return res;
    }
}
