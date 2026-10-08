/**
 * Definition for an n-ary tree node.
 * class TreeNode {
 *     int val;
 *     List<TreeNode> children;
 * 
 *     TreeNode(int _val) {
 *         val = _val;
 *         children = new ArrayList<>();
 *     }
 * }
 **/


class Solution {
    public TreeNode cloneTree(TreeNode root) {
        if(root == null)
            return null;
        
        return createClone(root);
    }

    public static TreeNode createClone(TreeNode root){
        TreeNode node = new TreeNode(root.val);

        for(TreeNode a : root.children)
            node.children.add(createClone(a));

        return node;
    }
}
