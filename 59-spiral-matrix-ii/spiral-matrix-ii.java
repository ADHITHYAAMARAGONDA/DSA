class Solution {
    public int[][] generateMatrix(int n) {
        int l=n;
        int m=n;
        int [][] res=new int[l][m];
        int top=0,left=0;
        int bottom=n-1,right=n-1;
        int ele=1;
        while(top<=bottom && left<=right){
             for(int col=left;col<=right;col++){
                res[top][col]=ele++;
 
            }
            top++;
        

             for(int row=top;row<=bottom;row++){
                res[row][right]=ele++;
             }
             right--;
              for(int col=right;col>=left;col--){
                res[bottom][col]=ele++;
            }
            bottom--;
        
         
        for(int row=bottom;row>=top;row--){
            res[row][left]=ele++;
        }
        left++;
        


        
    }
    return res;
    }
}