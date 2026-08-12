# Minimize the Heights II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  representing the heights of n towers and a positive integer  **k**. For each tower, perform exactly one of the following operations exactly once:

- Increase its height by k, or
- Decrease its height by k.

After performing the operation on every tower, the height of any tower must not become negative.

Return the minimum possible difference between the heights of the tallest and the shortest towers after modifying all the towers.

 **Note:**  A slight modification of the problem can be found here.

 **Examples :** 

```
Input: k = 2, arr[] = [1, 5, 8, 10]
Output: 5
Explanation: The array can be modified as [1+k, 5-k, 8-k, 10-k] = [3, 3, 6, 8]. The difference between the largest and the smallest is 8-3 = 5.

```

```
Input: k = 3, arr[] = [3, 9, 12, 16, 20]
Output: 11
Explanation: The array can be modified as [3+k, 9+k, 12-k, 16-k, 20-k] = [6, 12, 9, 13, 17]. The difference between the largest and the smallest is 17-6 = 11. 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T09:43:41.907Z  

```java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        // now the array is sorted hence arr[0] smallest and last ele. is biggest 
        int n = arr.length;
        int ans = arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)
                continue;
            
            int min =Math.min(arr[0]+k , arr[i]-k);
            int max =Math.max(arr[n-1]-k,arr[i-1]+k);
            
            ans =Math.min(ans,max-min);
            
        }
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1)