import java.util.*;

public class BSTLevelOrder
{   
//   https://leetcode.com/problems/binary-tree-level-order-traversal/

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
         if(root == null){
            return list;
        }

        Queue<TreeNode> qq = new LinkedList<>();

        qq.add(root);

        while(!qq.isEmpty()){

            int size = qq.size();

            List<Integer> ll = new ArrayList<>();

            while(size-- > 0){
                
            
            TreeNode rv = qq.poll();
                ll.add(rv.val);
                if(rv.left != null){
                    qq.add(rv.left);
                }
                if(rv.right != null){
                    qq.add(rv.right);
                }
                
            
            }
            list.add(ll);




        }   
        return list; 
        
    }
}
