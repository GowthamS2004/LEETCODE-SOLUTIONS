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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
        Queue<TreeNode> q = new LinkedList<>(); 
        q.offer(root); 
        while(!q.isEmpty())
        {
            int size = q.size(); 
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.poll(); 
                list.add(temp.val);
                if(res.size()%2!=0)
                {
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
                }
                else
                {
                    if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
                 if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                }
            }
           
            res.add(list);
        }
       return res;

    }
}