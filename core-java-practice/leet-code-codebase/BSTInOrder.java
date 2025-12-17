import java.util.*;

public class BSTInOrder
{   
//   https://leetcode.com/problems/binary-tree-inorder-traversal/

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList <Integer> list = new ArrayList<Integer> ();
        inorder(root, list);
        return list;
        
    }
    public static void inorder(TreeNode root , ArrayList<Integer> list){

        if(root == null){
            return ;
        }
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);

    }
}
