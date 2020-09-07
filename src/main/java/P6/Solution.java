package P6;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String res = "";
        for (int i = 0; i < numRows; i++) {
            int j = 0;
            while (true) {
                if (j >= s.length()) break;
                if (i == 0) {
                    res += s.charAt(j);
                } else if (i == numRows - 1) {
                    if (j + numRows - 1 < s.length()) {
                        res += s.charAt(j + numRows - 1);
                    }
                } else {
                    if (j + i < s.length()) {
                        res += s.charAt(j + i);
                    }
                    if (j + (numRows - 1) * 2 - i < s.length()) {
                        res += s.charAt(j + (numRows - 1) * 2 - i);
                    }
                }
                j += (numRows - 1) * 2;
            }
        }
        return res;
    }
}