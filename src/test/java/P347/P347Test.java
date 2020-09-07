package P347;

import org.junit.Test;
import static org.junit.Assert.*;

public class P347Test {
    Solution solution = new Solution();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1, 1, 2, 3}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(new int[]{1, 2, 3, 4, 1, 2, 2}, 2));
    }
}
