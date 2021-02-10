package leetcode;

import java.util.HashMap;

public class MidWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minWindow(s, t);
        System.out.println(res);
    }

    public static String minWindow(String s, String t) {
        // 需要筹齐的
        HashMap<Character,Integer> need = new HashMap<>();
        // 滑窗内筹齐的
        HashMap<Character,Integer> window = new HashMap();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }

        int left = 0;
        int right = 0;
        int vaildNum = 0;
        int begin = 0;
        int valid_length = Integer.MAX_VALUE;
        // 窗口到达边界则结束
        while(right < s.length()){
            // 先扩大窗口,找到所有凑齐的元素则停止
            char addChar = s.charAt(right);
            right++;
            // 如果是待凑齐的元素,那就增加 window 计数
            if(need.containsKey(addChar)){
                window.put(addChar,window.getOrDefault(addChar,0)+1);
                // 如果出现次数和待凑齐的元素一样,有效字符数+1
                if(window.get(addChar).equals(need.get(addChar))){
                    vaildNum++;
                }
            }
            // 如果窗口中凑齐的元素符合条件,则开始从左边缩小窗口,找出最小子串
            while(vaildNum == need.size()){
                // 只要能进来就说明是符合要求的子串
                // 如果长度比之前小就替换
                if(right - left < valid_length){
                    valid_length = right - left;
                    begin = left;
                }

                char removeChar = s.charAt(left);
                left++;
                // 如果是待凑齐的元素,那就减少的计数
                if(need.containsKey(removeChar)){
                    // 如果当前是符合条件的,那减了就不符合了
                    if(window.get(removeChar).equals(need.get(removeChar))){
                        vaildNum--;
                    }
                    window.put(removeChar,window.get(removeChar)-1);
                }
            }
        }

        return valid_length == Integer.MAX_VALUE ? "" : s.substring(begin,begin+valid_length);
    }
}
