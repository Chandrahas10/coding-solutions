# Stickler Thief

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot. Given an array,  **arr[]**  where arr[i] represents the amount of money in the i-th house. Find the maximum amount he can loot.

 **Examples:** 

```
Input: arr[] = [6, 7, 1, 3, 8, 2, 4]
Output: 19
Explanation: Maximum amount he can get by looting 1st, 3rd, 5th and 7th house, which is 6 + 1 + 8 + 4 = 19.
```

```
Input: arr[] = [5, 3, 4, 11, 2]
Output: 16
Explanation: Maximum amount he can get by looting 1st and 4th house, which is 5 + 11 = 16.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T16:30:29.025Z  

```java
class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        
        int prev2 =0;
        int prev1=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            int take = arr[i]+prev2;
            int skip =prev1;
            
            int current =Math.max(take,skip);
            
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1)