class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];        
            
        }
        int maxsum =sum;
        
       int start =0;
       int end=k;
       
       while(end<arr.length){
            sum=sum -arr[start++] +arr[end++];
          maxsum =Math.max(maxsum,sum);
       }
       return maxsum;
    }
}