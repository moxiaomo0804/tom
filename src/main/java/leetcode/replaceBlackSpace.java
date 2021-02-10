package leetcode;

import java.util.Stack;

public class replaceBlackSpace {


    public static void main(String[] args) {
        String s = "We are happy.";
        
        String s1 = replaceSpace(s);
        System.out.println(s1);
        
    }
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (' ' == (chars[i])){
                chars[i] = '%';
            }
        }
        return String.valueOf(chars);
    }
}
