package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDifference {
    public static void main(String[] args) {

        String s = "a";
        String t = "aa";
        char theDifference = findTheDifference(s, t);
        System.out.println(theDifference);
    }
    public static char findTheDifference(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Set<Character> setT = new HashSet<>();
        for (char chars : charsS) {
            setT.add(chars);
        }
        for (char chart : charsT) {
            if (!setT.contains(chart)) {
                return chart;
            }
        }
        return ' ';
    }
}
