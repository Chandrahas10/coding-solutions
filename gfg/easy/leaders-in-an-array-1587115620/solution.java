class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> nums =new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                 nums.add(arr[i]);
                max=arr[i];
            }
               
        }
        
        Collections.reverse(nums);
        return nums;
    }
}
