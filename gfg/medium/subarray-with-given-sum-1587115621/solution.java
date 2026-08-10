
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int start =0;
        int end =0;
        int sum=arr[0];
        while(end<arr.length){
            if(sum == target){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
            
            else if(sum < target){
                end++;
                
                if(end<arr.length){
                    sum+=arr[end];
                }
            }
            
            else{
                sum-=arr[start];
                start++;
                
                // if()
                
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }
}
