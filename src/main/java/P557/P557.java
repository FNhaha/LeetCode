package P557;

import java.util.Stack;

public class P557 {
    public String reverseWords(String s) {
        String[] s_split = s.split(" ");
        String res = "";
        int i = 0;
        while (true) {
            res += reverse(s_split[i]);
            i++;
            if (i >= s_split.length) {
                break;
            }
            res += ' ';
        }
        return res;
    }
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
