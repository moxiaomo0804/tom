package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        String[] strings = permutation("abc");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] permutation(String s) {
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        backtrack(chars, list);
        return null;
    }
    public static void backtrack(char[] chars, List<Character> track) {
        if(chars.length == track.size()) {
            StringBuilder sb = new StringBuilder();
            for(Character s : track) {
                sb.append(s);
            }
            res.add(sb.toString());
            return;
        }

        for(int i = 0; i < chars.length; i++) {
            track.add(chars[i]);
            backtrack(chars, track);
            track.remove(track.size() - 1);
        }
    }
}
