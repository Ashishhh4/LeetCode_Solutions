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
    private static TreeNode help(int []nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=help(nums,low,mid-1);
        n.right=help(nums,mid+1,high);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return help(nums,0,n-1);
    }
}