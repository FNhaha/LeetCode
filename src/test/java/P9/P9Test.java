package P9;

import org.junit.Test;
import static org.junit.Assert.*;

public class P9Test {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    public void test2() {
        assertFalse(solution.isPalindrome(-121));
    }


    @Test
    public void test3() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    public void test4() {
        assertTrue(solution.isPalindrome(1000000001));
    }
}

