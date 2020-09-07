package P5;

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int left = 0; (s.length() - left - 1) * 2 + 1 > res.length();) {
            String temp = s.substring(left, left + 1);
            int right = left;
            char c = s.charAt(left);
            for (int j = 1; j + left < s.length(); j++) {
                if (c == s.charAt(left + j)) {
                    temp += c;
                    right++;
                } else {
                    break;
                }
            }
            for (int j = 1; left - j >=0 && right + j < s.length(); j++) {
                char cp = s.charAt(left - j), cn = s.charAt(right + j);
                if (cp == cn) {
                    temp = cp + temp + cn;
                } else {
                    break;
                }
            }
            if (temp.length() > res.length()) {
                res = temp;
            }
            left = right + 1;
        }
        return res;
    }
}
