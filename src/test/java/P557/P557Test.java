package P557;

import P557.P557;
import org.junit.Test;
import static org.junit.Assert.*;

public class P557Test {
    @Test
    public void test() {
        P557 p557 = new P557();
        assertEquals("s'teL ekat edoCteeL tsetnoc", p557.reverseWords("Let's take LeetCode contest"));
    }
}
