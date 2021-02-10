package leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{9,9,9};
        int[] res = plusOne(nums);
        for (int re : res) {
            System.out.println(re);
        }
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int curry = 1;
        for(int i = len - 1; i >= 0; i--) {
            curry += digits[i];
            digits[i] = curry % 10;
            curry /= 10;
        }
        if (curry != 0) {

        }
        System.out.println(curry);
        return digits;
    }
}
