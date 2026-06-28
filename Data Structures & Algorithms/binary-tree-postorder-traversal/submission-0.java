class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        dfs(root);
        return list;
    }

    public void dfs(TreeNode node){

        if(node==null)return ;
        dfs(node.left);
        dfs(node.right);
        list.add(node.val);


        
    }
}