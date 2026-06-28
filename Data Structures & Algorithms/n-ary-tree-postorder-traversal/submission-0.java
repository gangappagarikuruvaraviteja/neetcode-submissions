class Solution {
    List<Integer>list=new ArrayList<>();
        public void dfs(Node node){
                if(node==null)return;
               
               for(Node child:node.children){
                dfs(child);
               }

               list.add(node.val);
        }
    public List<Integer> postorder(Node root) {
            dfs(root);
            return list;
    }
}