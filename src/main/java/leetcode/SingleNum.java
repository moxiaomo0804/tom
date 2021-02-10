package leetcode;

public class SingleNum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
