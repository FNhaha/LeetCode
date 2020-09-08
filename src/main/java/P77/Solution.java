package P77;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return combine0(1, n, k);
    }
    private List<List<Integer>> combine0(int left, int right, int k) {
        if (k == 1) {
            List<List<Integer>> res = new LinkedList<>();
            for (; left <= right; left++) {
                List<Integer> temp = new LinkedList<>();
                temp.add(left);
                res.add(temp);
            }
            return res;
        }

        List<List<Integer>> res = new LinkedList<>();
        for (; right - left >= k - 1; left++) {
            List<List<Integer>> temp = combine0(left + 1, right, k - 1);
            for (List<Integer> j : temp) {
                j.add(left);
                res.add(j);
            }
        }
        return res;
    }
}
