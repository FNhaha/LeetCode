package P9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        long l = 100;
        while (x >= l) {
            l *= 10;
        }
        l /= 10;
        while (l != 0) {
            if (x / l != x % 10) {
                return false;
            }
            x = x % (int)l;
            x /= 10;
            l /= 100;
        }
        return true;
    }
}
