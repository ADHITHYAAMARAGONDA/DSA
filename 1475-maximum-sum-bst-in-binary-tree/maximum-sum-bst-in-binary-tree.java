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
    private int maxsum=0;

    private static class NodeV{
    public int minNode,maxNode,maxsize;
    public boolean isBST;
    public NodeV(int minNode,int maxNode,int maxsize,boolean isBST){
        this.minNode=minNode;
        this.maxNode=maxNode;
        this.maxsize=maxsize;
        this.isBST=isBST;

    }
 }
 public int maxSumBST(TreeNode root) {
        LargestBST(root);
        return maxsum;
    
}
    public NodeV LargestBST(TreeNode root){
        if(root==null){
            return new NodeV(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        }
        NodeV left=LargestBST(root.left);
        NodeV right=LargestBST(root.right);
        if(left.isBST && right.isBST && left.maxNode<root.val && root.val<right.minNode){
            int currsum=left.maxsize+right.maxsize+root.val;
            maxsum=Math.max(currsum,maxsum);
            return new NodeV(Math.min(left.minNode,root.val),Math.max(right.maxNode,root.val),currsum,true);
        }
        return new NodeV(Integer.MIN_VALUE,Integer.MAX_VALUE,0,false);

    }
}
     