class Solution {
    public void rotate(int[][] matrix) {


        int rows=matrix.length;
        int cols=matrix[0].length;

        int [][]res=new int[cols][rows];
        // Tranissponse the matrix simple 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[j][i]=matrix[i][j];
            }
        }

        // REVSERS ETHE MATEIX 
        for(int i=0;i<res.length;i++){
            int left=0;
            int right=res[i].length-1;
            while(left<right){
                int temp=res[i][left];
                res[i][left]=res[i][right];
                res[i][right]=temp;
            left++;
            right--;
            
                }
        }

        // back to the matix insted of res
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=res[i][j];
            }
        }
        
    }
}
