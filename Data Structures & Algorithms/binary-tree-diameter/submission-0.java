class Solution {
    int diameter=0;
    public int dfs(TreeNode node){
            if(node==null)return 0;

       int left=dfs(node.left);
       int right=dfs(node.right);

        diameter=Math.max(diameter,left+right);

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {

            dfs(root);
            return diameter;

       
       

    }
}
