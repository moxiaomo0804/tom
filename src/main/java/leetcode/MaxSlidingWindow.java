package leetcode;

import java.util.LinkedList;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {7,2,4};
        int[] res = maxSlidingWindow(nums, 2);
        LinkedList<Integer> q = new LinkedList<>();
        for (int re : res) {
            System.out.print(re);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len - k + 1];
        int l = 0;
        int r = l + k - 1;
        int idx = 0;
        while(r < len) {
            int index = l;
            int count = 0;
            int max = Integer.MIN_VALUE;
            while(count < k) {
                max = Math.max(max, nums[index++]);
                count++;
            }
            result[idx++] = max;
            l += 1;
            r += 1;
        }
        return result;
    }
}
