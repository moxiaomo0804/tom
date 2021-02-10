package leetcode;

public class removeDuplicatesTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 1){
            return nums.length;
        }

        int i = 0,j = 1;
        while(j < nums.length){
            if(nums[i]==nums[j]){
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}
