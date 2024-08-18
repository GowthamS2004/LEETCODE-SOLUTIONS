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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        String s="";
        solve(root,ans,s);
        return ans;
    }
    public void solve(TreeNode root, List<String> ans,String s)
    {
        if(root==null)
        {
            return;
        }
        s+=root.val;
        if(root.left==null && root.right==null)
        {
            
            ans.add(s);
        }
        else
        {
            solve(root.left,ans,s+"->");
            solve(root.right,ans,s+"->");
        }
    }
}