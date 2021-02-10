package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solutions {
    public static void main(String[] args) {
       int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }*/

        Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target-nums[i]), i};
            }
            hashTable.put(nums[i],i);
        }
        return new int[]{0};
    }
}
