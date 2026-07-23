# peak-element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-23T12:16:47.609Z  

```java
class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1) return 0;
        
        if(arr[0]>=arr[1]) return 0;
        
        for(int i=1;i<n-1;i++){
            if((arr[i-1]<arr[i]) && (arr[i]> arr[i+1]))
                return i;
        }
        
        if(arr[n-2]<arr[n-1]) return n-1;
        
        return 0;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/peak-element/1)