package P5;

import org.junit.Test;
import static org.junit.Assert.*;

public class P5Test {
    Solution solution = new Solution();
    @Test
    public void test1() {
        assertEquals("bb", solution.longestPalindrome("abbc"));
    }

    @Test
    public void test2() {
        assertEquals("ccc", solution.longestPalindrome("ccc"));
    }
}
