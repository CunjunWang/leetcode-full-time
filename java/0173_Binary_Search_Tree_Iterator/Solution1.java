/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    private List<Integer> vals;
    private int curIndex;

    /*
     * Use a list to store the BST values;
     * Fill the list with Inorder traversal;
     *
     * Time Complexity: O(n);
     * Space Complexity: O(n);
     */
    public BSTIterator(TreeNode root) {
        vals = new ArrayList<>();
        curIndex = 0;
        
        inOrder(root);
    }
    
    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        
        inOrder(root.left);
        vals.add(root.val);
        inOrder(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        int val = vals.get(curIndex);
        curIndex++;
        return val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return curIndex != vals.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */