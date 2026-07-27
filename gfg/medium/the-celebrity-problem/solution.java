class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int knowme[] =new int[mat.length];
        int iknow[] =new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j) continue;
                if(mat[i][j]==1)            {
                    knowme[j]++;
                    iknow[i]++;
                }
            }
        }
        
        for(int i = 0; i < mat.length; i++){
         if(iknow[i] == 0 && knowme[i] == mat.length - 1){
             return i;
            }
        }
        
        return -1;
         
    }
}