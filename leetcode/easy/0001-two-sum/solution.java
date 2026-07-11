class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap =new HashMap<>();
        int n= nums.length;

        for(int i=0;i<n;i++){
            int com = target -nums[i];
            if(numMap.containsKey(com))
                return new int[] {numMap.get(com),i};
            
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }
}