package P347;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> nums_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums_map.containsKey(nums[i])) {
                nums_map.put(nums[i], nums_map.get(nums[i]) + 1);
            } else {
                nums_map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return nums_map.get(o1) - nums_map.get(o2);
            }
        });
        for (Map.Entry<Integer, Integer> e: nums_map.entrySet()) {
            if (queue.size() < k) {
                queue.add(e.getKey());
            } else if (e.getValue() > nums_map.get(queue.peek())) {
                queue.remove();
                queue.add(e.getKey());
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.remove();
        }
        return res;
    }
}
