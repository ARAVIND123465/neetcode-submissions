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
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isBST(TreeNode root, long lowerbound, long upperbound){
           if(root==null) return true;
           if(root.val<=lowerbound || root.val>=upperbound)return false;
           boolean left =  isBST(root.left,lowerbound, root.val);
           boolean right = isBST(root.right, root.val, upperbound);
           return left && right;
    }
}
