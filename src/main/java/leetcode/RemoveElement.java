package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] res = removeElement(nums, 3);
        for (int re : res) {
            System.out.println(re);
        }
    }
    public static int[] removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return new int[]{};
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return nums;
    }
}
