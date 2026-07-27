# Merge Without Extra Space

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two sorted arrays  **a[]**  and  **b[]** of size  **n** and  **m** respectively, the task is to merge them in sorted order without using any  **extra space**. Modify  **a[]**  so that it contains the first  **n**  elements and modify  **b[]**  so that it contains the last  **m**  elements.

 **Examples:** 

```
Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
```

```
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].

```

```
Input: a[] = [0, 1], b[] = [2, 3]
Output: a[] = [0, 1], b[] = [2, 3]
Explanation: After merging two sorted arrays we get [0, 1, 2, 3].
```

 **Constraints:** 
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] ≤ 107

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-27T10:24:25.736Z  

```java
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length+b.length;
        int [] m=new int[n];
        int s1=0;
        int s2=0;
        int idx=0;
    
         while (s1 < a.length && s2 < b.length) {
            if (a[s1] <= b[s2]) {
                m[idx++] = a[s1++];
            } else {
                m[idx++] = b[s2++];
            }
        }
        
         while (s1 < a.length) {
         m[idx++] = a[s1++];
        }

        while (s2 < b.length) {
        m[idx++] = b[s2++];
        }
        
        for(int i=0;i<a.length;i++){
            a[i]=m[i];
        }
        for(int i=a.length;i<n;i++){
            b[i-a.length]=m[i];
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1)