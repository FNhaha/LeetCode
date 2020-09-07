package P6;

import org.junit.Test;
import static org.junit.Assert.*;

public class P6Test {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals("LCIRETOESIIGEDHN", solution.convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void test2() {
        assertEquals("", solution.convert("", 1));
    }

    @Test
    public void test3() {
        assertEquals("A", solution.convert("A", 1));
    }
}
