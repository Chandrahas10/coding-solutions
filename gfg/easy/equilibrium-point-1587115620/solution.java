class Solution {
    public static int findEquilibrium(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
            
        int Lsum =0;
        
        for(int i=0;i<arr.length;i++){
            int Rsum =sum - arr[i] -Lsum;
            
            if( Rsum==Lsum) 
                return i;
            
            Lsum+=arr[i];
        }
        
        return -1;
    }
}
