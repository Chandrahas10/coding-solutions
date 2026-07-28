class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAvg =sum/k;
        
        int start=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[start++]+nums[i];
            double avg=sum/k;
            maxAvg =Math.max(maxAvg,avg);
        }

        return maxAvg;
    }
}