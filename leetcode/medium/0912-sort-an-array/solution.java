class Solution {
    public int[] sortArray(int[] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums; 
    }
    private void mergeSortHelper(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            
            mergeSortHelper(nums, start, mid);
            mergeSortHelper(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }


    private void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1; 
        int n2 = end - mid;

        int[] Larr = new int[n1];
        int[] Rarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            Larr[i] = nums[start + i];
        }

        for (int j = 0; j < n2; j++) {
            Rarr[j] = nums[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (Larr[i] <= Rarr[j]) {
                nums[k++] = Larr[i++];
            } else {
                nums[k++] = Rarr[j++];
            }
        }

        while (i < n1) {
            nums[k++] = Larr[i++];
        }

        while (j < n2) {
            nums[k++] = Rarr[j++];
        }
    }
}