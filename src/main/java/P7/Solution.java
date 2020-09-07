package P7;

import java.util.Stack;

public class Solution {
    public int reverse(int x) {
        int offset = x > 0? 1: -1;
        x = Math.abs(x);
        int res = 0;
        while (x > 0) {
            int n = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }
            res = res * 10 + n;
            x /= 10;
        }
        return res * offset;
    }
}
