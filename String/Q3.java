package String;

public class Q3 {
    public String q3(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i+2 < s.length() && "LIE".equals(s.substring(i, i + 3))) {
                if (res.isEmpty()) {
                    res.append(' ');
                }else{
                    res.append(' ');
                    i+=3;
                }    // gpt hihihihihi                
            }else{
                res.append(s.charAt(i));
                i++;
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        String res = q3.q3("LIELIEILIEAMLIECOOL");
        System.out.print(res);
    }
}
