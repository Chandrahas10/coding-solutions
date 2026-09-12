# Sort an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem  **without using any built-in**  functions in `O(nlog(n))` time complexity and with the smallest space complexity possible.

 

 **Example 1:** 

```
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

```

 **Example 2:** 

```
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -5  *104 <= nums[i] <= 5*  104

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 32.44%)  
**Memory:** 82.8 MB (beats 77.91%)  
**Submitted:** 2026-09-12T17:14:58.174Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sort-an-array/)