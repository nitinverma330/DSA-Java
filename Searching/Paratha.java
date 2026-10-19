package Searching;

public class Paratha {
    private boolean isValid(int rank[], int mean, int total_chif, int total_paratha){
        int n = rank.length;
        int paratha = 0;
        for(int i = 0; i < n; i++){
            int currentRank = rank[i];
            int j = 1;
            int total_time = 0;
            while (total_time <= mean) {
                if(total_time + j * currentRank <= mean){
                    total_time = total_time + j * currentRank;
                    paratha++;
                    j++;
                }else{
                    break;
                }
            }
            if(paratha >= total_paratha){
                return true;
            }
        }
        return false;
    }
    public int paratha(int rank[], int total_paratha, int total_chif){
        int n = rank.length;
        int res = 0;
        int start = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(max < rank[i]){
                max = rank[i];
            }
        }
        int end = max * total_paratha * (total_paratha + 1) / 2;
        int mean = 0;
        while (start <= end) {
            mean = start + (end - start) / 2;
            if(isValid(rank, mean, total_chif, total_paratha)){
                end = mean - 1;
                res = mean;
            }else{
                start = mean + 1;
            }
        }
        return res;
    }
}
