package leetcode;

import java.util.HashMap;
import java.util.Map;

public class firstUniqCharTest {
    public static void main(String[] args) {
        String s = "leetcode";
        char c = firstUniqChar(s);
        System.out.println(c);
    }
    public static char firstUniqChar(String s) {

        return ' ';

        /*if(root == null) return null;
        Stack<List<TreeNode>> stack = new Stack<List<TreeNode>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        stack.push(nodes);

        while(!stack.isEmpty()) {
            List<TreeNode> nextNodes = new ArrayList<TreeNode>();
            List<Integer> list = new ArrayList<>();
            List<TreeNode> nodess = stack.pop();
            for(int i = 0;i < nodess.size();i++) {
                TreeNode node = nodess.get(i);
                list.add(node.val);
                if(node.left != null) nextNodes.add(node.left);
                if(node.right != null) nextNodes.add(node.right);
            }
            res.add(list);
            stack.push(nextNodes);
        }
        return res;*/
    }
}
