# Balanced Tree Check

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the **root** of a binary tree, determine if it is height-balanced or not.

 **Note:**  A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

 **Examples:** 

```
Input: root = [10, 20, 30, 40, 60]

Output: true 
Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
```

```
Input: root = [1, 2, 3, 4, N, N, N, 5] 

Output: false
Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T15:10:49.867Z  

```java
/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return height(root)!= -1;
    }
    public int height(Node root){
        if(root==null)
            return 0;
        
        int L=height(root.left);
            if(L==-1)
                return -1;
        
        int R =height(root.right);
            if(R==-1)
                return -1;
        
        if(Math.abs(L-R)>1)
            return -1;
        
        return 1+Math.max(L,R);
    
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1)