# Shift 2D Grid

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D `grid` of size `m x n` and an integer `k`. You need to shift the `grid` `k` times.

In one shift operation:

- Element at grid[i][j] moves to grid[i][j + 1].
- Element at grid[i][n - 1] moves to grid[i + 1][0].
- Element at grid[m - 1][n - 1] moves to grid[0][0].

Return the  *2D grid*  after applying shift operation `k` times.

 

 **Example 1:** 

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]

```

 **Example 2:** 

```
Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

```

 **Example 3:** 

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m <= 50
- 1 <= n <= 50
- -1000 <= grid[i][j] <= 1000
- 0 <= k <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 97.01%)  
**Memory:** 47.3 MB (beats 44.14%)  
**Submitted:** 2026-07-20T11:38:03.949Z  

```java
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int size =m*n;
        k=k%size;

        int [] arr = new int[size];
        int l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[l++]=grid[i][j];
            }
        }

        for(int i=0;i<size;i++){
            int pos =(i+k)%size;
            grid[pos/n][pos%n]=arr[i];
        }

        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer>row =new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/shift-2d-grid/)