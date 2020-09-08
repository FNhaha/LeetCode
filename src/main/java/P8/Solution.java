package P8;

public class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        str = cutSpace(str);
        if (str.length() == 0) return 0;
        char c = str.charAt(0);
        int res = 0, offset = 1;
        boolean valid = false;
        if (c == '-') {
            if (str.length() == 1) return 0;
            offset = -1;
            str = str.substring(1);
        }
        if (c == '+') {
            if (str.length() == 1) return 0;
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                int temp = (int)c - (int)'0';
                if (offset > 0) if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                    return Integer.MAX_VALUE;
                }
                if (offset < 0) if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 8)) {
                    return Integer.MIN_VALUE;
                }
                res *= 10;
                res += temp;
                valid = true;
            } else break;
        }
        return valid? offset * res: 0;
    }
    private String cutSpace(String str) {
        int i = 0;
        while (str.charAt(i) == ' ') {
            i++;
            if (i == str.length()) return "";
        }
        return str.substring(i);
    }
}
