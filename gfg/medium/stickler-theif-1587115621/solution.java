class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        
        int prev2 =0;
        int prev1=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            int take = arr[i]+prev2;
            int skip =prev1;
            
            int current =Math.max(take,skip);
            
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}