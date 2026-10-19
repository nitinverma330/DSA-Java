package String;

//Revers a string By Words (I am good boy -> boy good am i)
public class Q1 {
    public String reverse(String s){
        StringBuilder res = new StringBuilder();
        int i = s.length()-1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            res.append(s.substring(j+1,i+1));
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                res.append(' ');
            }
            i = j;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Q1 q1= new Q1();
        String res = q1.reverse("i am a good boy");
        System.out.print(res);
    }

}

