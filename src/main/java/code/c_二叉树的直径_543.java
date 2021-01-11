package code;

/**
 * @auther luoyong
 * @date 2020/12/04 16:09
 */

/*
* 二叉树的直径不一定过根节点，因此需要去搜一遍所有子树(例如以root，root.left, root.right...为根节点的树)对应的直径，取最大值。
root的直径 = root左子树高度 + root右子树高度
root的高度 = max {root左子树高度, root右子树高度} + 1
*
* */
public class c_二叉树的直径_543 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode node) {
        if (node == null) { //访问到空节点了，返回0
            return 0;
        }
        int L = dfs(node.left);//左儿子为根的子树深度
        int R = dfs(node.right);//右儿子为根的子树深度
        max = Math.max(max, L + R);//计算d_node即L+R+1 并更新max
        return Math.max(L, R) + 1;//返回该节点为根的子树的深度
    }
}
