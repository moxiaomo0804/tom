package leetcode;

import java.util.ArrayList;
import java.util.List;

public class subList {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3};
        List<List<Integer>> subsets = subsets(test);
        for (List<Integer> subList:subsets) {
            System.out.println(subList);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int num: nums){
            int resLength = res.size();
            for(int i = 0; i < resLength; i++){
                List<Integer> cur =  new ArrayList<>(res.get(i));
                cur.add(num);
                res.add(cur);
            }
        }
        return res;
    }
}
