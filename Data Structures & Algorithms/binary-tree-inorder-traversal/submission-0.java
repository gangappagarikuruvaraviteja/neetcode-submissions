
class Solution {

    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
            dfs(root);
            return list;
            


    }




        public void dfs(TreeNode node){
            if(node==null) return ;

            dfs(node.left);
            list.add(node.val);
            dfs(node.right);

        
        
    }
}