/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestConsecutive(TreeNode root) {
        // Your code goes here
        int[] max = {0};

        int CountRoot = getCount(root, max);

        return max[0];
    }

    public static int getCount(TreeNode root, int[] max){
        if (root == null)
            return 0;
        
        else{
            int countLeft, countRight, countRoot = 0;

            if(root.left != null){
                countLeft = getCount(root.left, max);
                if(root.left.val == root.val + 1)
                    countRoot = countLeft;
            }
            
            if(root.right != null){
                countRight = getCount(root.right, max);

                if(root.right.val == root.val + 1)
                    if(countRoot < countRight)
                        countRoot = countRight;
            }

            if(max[0] < countRoot + 1)
                max[0] = countRoot + 1;

            return countRoot + 1;
        }
    }
}
