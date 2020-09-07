package P3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class P3Test {
    @Test
    public void test() {
        Solution res = new Solution();
        Assert.assertEquals(2, res.lengthOfLongestSubstring("abba"));
        Assert.assertEquals(3, res.lengthOfLongestSubstring("abcb"));
        Assert.assertEquals(3, res.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(5, res.lengthOfLongestSubstring("tmmzuxt"));
    }
}
