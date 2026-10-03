/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/
class BSTIterator {
    List<Integer> list = new ArrayList<>();
    int i = -1;

    public BSTIterator(TreeNode root) {
        TreeNode node = new TreeNode(-1);
        node.left = null;
        node.right = root;

        inOrder(root, list);
    }
    
    public boolean hasNext() {
        if(this.i < this.list.size()-1)
            return true;
        
        return false;
    }
    
    public int next() {
        return this.list.get(++this.i);
    }
    
    public boolean hasPrev() {
        if(this.i > 0)
            return true;
        
        return false;
    }
    
    public int prev() {
        return this.list.get(--this.i);
    }

    public static void inOrder(TreeNode root, List<Integer> list){
        if(root.left != null)
            inOrder(root.left, list);
        
        list.add(root.data);

        if(root.right != null)
            inOrder(root.right, list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * boolean param_1 = obj.hasNext();
 * int param_2 = obj.next();
 * boolean param_3 = obj.hasPrev();
 * int param_4 = obj.prev();
 */
