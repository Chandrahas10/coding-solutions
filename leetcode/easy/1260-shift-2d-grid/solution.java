class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int size =m*n;
        k=k%size;

        int [] arr = new int[size];
        int l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[l++]=grid[i][j];
            }
        }

        for(int i=0;i<size;i++){
            int pos =(i+k)%size;
            grid[pos/n][pos%n]=arr[i];
        }

        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer>row =new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}