class Solution {

    int diameter = 0;//initialise

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode root) {

        if (root == null) { //base condition
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Update maximum diameter (measured in edges)
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}