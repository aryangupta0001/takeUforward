/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        //your code goes here
        
        if(root == null)
            return 0;
        
        int sum = 0;

        if(root.data < low)
            sum += rangeSumBST(root.right, low, high);

        else if(root.data > high)
            sum += rangeSumBST(root.left, low, high);

        else{
            sum += root.data;
            sum += rangeSumBST(root.right, low, high);
            sum += rangeSumBST(root.left, low, high);
        }

        return sum;
    }
}
