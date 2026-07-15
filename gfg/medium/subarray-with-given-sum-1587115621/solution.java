class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink the window while sum is greater than target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // If target sum is found
            if (sum == target) {
                ans.add(left + 1);   // 1-based indexing 
                ans.add(right + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}