package P4;

import P4.Solution;
import org.junit.Test;
import static org.junit.Assert.*;

public class P4Test {
    @Test
    public void test1() {
        Solution p4 = new Solution();

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        assertEquals(2.0, p4.findMedianSortedArrays(nums1, nums2), 0.01);
    }

    @Test
    public void test2() {
        Solution p4 = new Solution();

        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{2, 3, 4, 5, 6, 7};
        assertEquals(4.0, p4.findMedianSortedArrays(nums1, nums2), 0.01);
    }
}
