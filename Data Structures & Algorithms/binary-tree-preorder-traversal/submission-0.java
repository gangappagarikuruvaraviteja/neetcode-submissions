
class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

            dfs(root);
            return list;
        
    }

        public void dfs(TreeNode node){

            if(node==null) return ;

                list.add(node.val);
                dfs(node.left);
                dfs(node.right);
        }
}