class NumMatrix {
    int[][] prefixSums;
    public NumMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        prefixSums=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j==0){
                    prefixSums[i][j]=matrix[i][j];
                }else if(i==0 && j>0){
                    prefixSums[i][j]=prefixSums[i][j-1] + matrix[i][j]; 
                }else if(i>0 && j==0){
                    prefixSums[i][j]=prefixSums[i-1][j] + matrix[i][j]; 
                }else{
                    prefixSums[i][j]=prefixSums[i][j-1] + prefixSums[i-1][j] - prefixSums[i-1][j-1] + matrix[i][j]; 
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1>0 && col1>0){
            return prefixSums[row2][col2]-prefixSums[row1-1][col2]-prefixSums[row2][col1-1]+prefixSums[row1-1][col1-1];
        }else if(row1>0 && col1==0){
            return prefixSums[row2][col2]- prefixSums[row1-1][col2];
        }else if(row1==0 && col1>0){
            return prefixSums[row2][col2]- prefixSums[row2][col1-1];
        }else{
            return prefixSums[row2][col2];
        }
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
