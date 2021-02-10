package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class singleNumberTest {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        int i = singleNumber(nums);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            if (value == 1){
                result =  next.getKey();
            }
        }
        return result;
    }
}
