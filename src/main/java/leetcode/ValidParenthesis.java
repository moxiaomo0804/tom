package leetcode;

import java.util.*;

public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> characters = new Stack<>();

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)) {
                stack.push(pairs.get(ch));
            } else {
                Character pop = stack.pop();
                if (!pop.equals(ch)) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
