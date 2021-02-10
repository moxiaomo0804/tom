package leetcode;

import java.util.HashMap;
import java.util.Map;

public class majorityElementTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2,2,2,5,4,2};
        int i = majorityElement(nums);
        System.out.println(i);
    }
    public static int majorityElement(int[] nums) {
        int ans = nums[0], count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0) ans = nums[i];
            if(nums[i] == ans) {
                count++;
            }
            else {
                count--;
            }
        }
        return ans;
    }
}
