package P7;

import static org.junit.Assert.*;
import org.junit.Test;

public class P7Test {
    Solution solution = new Solution();
    @Test
    public void test1() {
        assertEquals(123, solution.reverse(321));
    }

    @Test
    public void test2() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.reverse(10));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.reverse(1));
    }

    @Test
    public void test6() {
        assertEquals(0, solution.reverse(1534236469));
    }

    @Test
    public void test7() {
        assertEquals(0, solution.reverse(-1534236469));
    }
}
