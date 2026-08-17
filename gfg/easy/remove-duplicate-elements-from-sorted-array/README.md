# Remove Duplicates Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **sorted array arr[]**  containing positive integers. Your task is to  **remove all duplicate elements**  from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
 **Examples :** 

```
Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.

```

```
Input: arr[] = [1, 2, 4]
Output: [1, 2, 4]
Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T18:17:56.243Z  

```java
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0) {
            return ans;
        }

        int start = 0;
        int end = 1;

        ans.add(arr[start]);

        while (end < arr.length) {

            if (arr[start] != arr[end]) {
                start = end;
                ans.add(arr[start]);
            }

            end++;
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1)