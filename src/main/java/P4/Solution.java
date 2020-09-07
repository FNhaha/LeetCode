package P4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mn = nums1.length + nums2.length;
        if ((mn & 1) == 1) {
            return findKth(nums1, nums2, (mn + 1) / 2, false);
        } else {
            return findKth(nums1, nums2, mn / 2, true);
        }
    }
    private double findKth(int[] nums1, int[] nums2, int k, boolean both) {
        int start1 = -1, start2 = -1;
        double res = 0.0, offset = 1.0;
        while (true) {
            if (start1 + 1 == nums1.length) {
                if (both) {
                    res += (nums2[start2 + k] + nums2[start2 + k + 1]) / 2.0;
                    break;
                } else {
                    res += nums2[start2 + k];
                    break;
                }
            }
            if (start2 + 1 == nums2.length) {
                if (both) {
                    res += (nums1[start1 + k] + nums1[start1 + k + 1]) / 2.0;
                    break;
                } else {
                    res += nums1[start1 + k];
                    break;
                }
            }
            if (k == 1) {
                res += Math.min(nums1[start1 + 1], nums2[start2 + 1]);
                if (both) {
                    both = false;
                    offset = 0.5;
                    k++;
                } else {
                    break;
                }
            }
            int index1 = start1 + (k / 2) >= nums1.length? nums1.length - 1 : start1 + (k / 2);
            int index2 = start2 + (k / 2) >= nums2.length? nums2.length - 1 : start2 + (k / 2);
            if (nums1[index1] >= nums2[index2]) {
                k -= index2 - start2;
                start2 = index2;
            } else {
                k -= index1 - start1;
                start1 = index1;
            }
        }
        return res * offset;
    }
}
