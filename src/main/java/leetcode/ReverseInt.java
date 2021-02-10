package leetcode;

public class ReverseInt {
    public static void main(String[] args) {
        int reverse = reverse(-321);
        String s = new String();
    }
    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n ? (int)n:0;
    }
}
