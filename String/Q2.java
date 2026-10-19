package String;

public class Q2 {
    public char q2(String s) {
        int n = s.length();
        int max = -1;
        char ans = 'a';
        int freq[] = new int[26];

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            freq[currentChar - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (max < freq[i]) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Q2 q = new Q2();
        char ans = q.q2("nitin");
        System.out.println(ans);
    }
}
