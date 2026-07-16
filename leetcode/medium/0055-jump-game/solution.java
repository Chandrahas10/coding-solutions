class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0] == 0) return true;

        if(nums[0]==1 ) return true;

        int far =0;
        int cend =0;

        for(int i=0;i<nums.length-1;i++){
            far = Math.max(far,i+nums[i]);

            if(i== cend){
                if(far ==cend)
                    return false;
                
                cend =far;
            }
        }
        return true;
    }
}