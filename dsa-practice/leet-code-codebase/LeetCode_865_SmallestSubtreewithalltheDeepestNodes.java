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

// // Approach --1 

// Find the maximum depth of the tree
// Find all nodes at that maximum depth
// Compute the LCA of those deepest nodes


// i have  used Ai for the comments as i want to provide step wise comments and explain the code more clearly 
class Solution {

    //   maximum depth of the tree
    int maxDepth;

    // final answer (lowest node containing all deepest nodes)
    TreeNode ans = null;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        // Step 1: find maximum depth of tree
        maxDepth = maxDepth(root);

        // Step 2: traverse again to find LCA of deepest nodes
        dfs(root, 1);

        return ans;
    }

    // returns how many deepest nodes exist in this subtree
    int dfs(TreeNode root, int depth) {

        // if tree is empty, no deepest nodes
        if (root == null) return 0;

        // check left and right subtrees
        int left = dfs(root.left, depth + 1);
        int right = dfs(root.right, depth + 1);

        // if current node is at maximum depth,
        // it is itself a deepest node
        if (depth == maxDepth) {
            return 1;
        }

        // if both left and right contain deepest nodes,
        // current node is the lowest common ancestor
        if (left > 0 && right > 0 && ans == null) {
            ans = root;
        }

        // return total deepest nodes found below
        return left + right;
    }

    // helper function to calculate max depth
    int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


// Approach --2


class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        // final answer is stored in Pair.node
        return dfs(root).node;
    }

    // Pair stores:
    // node  -> answer node for this subtree
    // depth -> maximum depth from this node
    class Pair {
        TreeNode node;
        int depth;

        Pair(TreeNode n, int d) {
            node = n;
            depth = d;
        }
    }

    // returns both depth and best node together
    Pair dfs(TreeNode root) {

        // empty tree has depth 0 and no node
        if (root == null) {
            return new Pair(null, 0);
        }

        // get info from left and right subtrees
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        // if both sides are equally deep,
        // current node is the LCA of deepest nodes
        if (left.depth == right.depth) {
            return new Pair(root, left.depth + 1);
        }

        // if left is deeper, propagate left answer
        if (left.depth > right.depth) {
            return new Pair(left.node, left.depth + 1);
        }

        // otherwise, propagate right answer
        return new Pair(right.node, right.depth + 1);
    }
}

