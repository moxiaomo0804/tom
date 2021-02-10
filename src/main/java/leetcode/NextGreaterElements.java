package leetcode;

import java.util.Stack;

public class NextGreaterElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        int[] res = nextGreaterElements(nums);
    }
    public static int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length < 1) return new int[]{0};
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
