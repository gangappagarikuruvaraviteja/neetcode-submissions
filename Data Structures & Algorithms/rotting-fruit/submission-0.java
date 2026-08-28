class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]>queue=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        //minitues has passed 
        int min=0;
        //directions up, down,left,right
        int [][]directions={
        {-1,0},
        {1,0},
        {0,-1},
        {0,1}};
        while(!queue.isEmpty() && fresh>0){
            int size=queue.size();
            // int size=queue.size();
            for(int i=0;i<size;i++){
                int []current=queue.poll();
                int r=current[0];
                int c=current[1];
                for(int []direction:directions){
                    int nr=r+direction[0];
                    int nc=c+direction[1];

                    

                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;

                        queue.offer(new int[]{nr,nc});
                    }
                }
            }
            min++;
        }

    return fresh==0?min:-1;

        
    }
}
