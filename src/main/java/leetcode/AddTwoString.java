package leetcode;

public class AddTwoString {
    public static void main(String[] args) {
        String res = addStrings("678", "1678");
        System.out.println(res);
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        char[] nums1 = num1.toCharArray();
        char[] nums2 = num2.toCharArray();
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0) {
            if(i >= 0) carry += nums1[i--] - '0';
            if (j >= 0) carry += nums2[j--] - '0';
            sb.append((char)(carry%10 + '0'));
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
