package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = new char[]{'h','e','l','l','o'};
        resverString(chars);
    }
    public static void resverString(char[] chars){

        char temp;
        int begin = 0;
        int end = chars.length - 1;
        while (begin <= end) {
            temp = chars[begin];
            chars[begin] = chars[chars.length - 1 - begin];
            chars[chars.length - 1 - begin] = temp;
            begin ++;
            end--;
        }
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

    }
}
