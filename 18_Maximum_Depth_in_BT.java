/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int data) { data = data; left = null, right = null }
 * }
 **/

class Solution {
    public int maxDepth(TreeNode root) {
        //your code goes here

        Map<TreeNode, Integer> map = new HashMap<>();

        return calcDepth(root, map);
    }

    public static int calcDepth(TreeNode root, Map<TreeNode, Integer> map){
        if(root == null)
            return 0;
        
        if(map.containsKey(root))
            return map.get(root);

        int leftDepth = calcDepth(root.left, map);
        int rightDepth = calcDepth(root.right, map);

        int depth = leftDepth > rightDepth ? leftDepth : rightDepth;
        
        map.put(root, depth + 1);
        return depth + 1;
    }
}
