package P8;

import org.junit.Test;

import static org.junit.Assert.*;

public class P8Test {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(123456, solution.myAtoi("123456"));
    }

    @Test
    public void test2() {
        assertEquals(123, solution.myAtoi("      123"));
    }

    @Test
    public void test3() {
        assertEquals(-2837, solution.myAtoi("-2837"));
    }

    @Test
    public void test4() {
        assertEquals(573, solution.myAtoi("+573"));
    }

    @Test
    public void test5() {
        assertEquals(-97, solution.myAtoi("     -97"));
    }

    @Test
    public void test6() {
        assertEquals(6509, solution.myAtoi("6509 with words"));
    }

    @Test
    public void test7() {
        assertEquals(0, solution.myAtoi("words and 2384"));
    }

    @Test
    public void test8() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-91283472332"));
    }

    @Test
    public void test9() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("           23423423525"));
    }

    @Test
    public void test10() {
        assertEquals(0, solution.myAtoi(""));
    }

    @Test
    public void test11() {
        assertEquals(0, solution.myAtoi(" "));
    }
}
