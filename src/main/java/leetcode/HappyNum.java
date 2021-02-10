package leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNum {
    public static void main(String[] args) {
        int result = add(123);
        List<Integer> list = new ArrayList<>();
        System.out.println(result);
    }
    public static int add(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

}
