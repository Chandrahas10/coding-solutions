# Level Order Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **root** of a Binary Tree, your task is to return its Level Order Traversal.

 **Note:** A level order traversal is a breadth-first search (BFS) of the tree. It visits nodes level by level, starting from the root, and processes all nodes from left to right within each level before moving to the next.

 **Examples:** 

```
Input: root = [1, 2, N, N, 3, N, N]

Output: [1, 2, 3]
Explanation: We start with the root node 1, so the first level of the traversal is [1]. Then we move to its children 2 and 3, which form the next level, giving the final output [1, 2, 3].
```

```
Input: root = [10, 20, 30, N, N, 40, 50, N, N, N, N]

Output: [10, 20, 30, 40, 50]
Explanation: We begin with the root node 10, which forms the first level as [10]. Its children 20 and 30 make up the second level, and their children 40 and 50 form the third level, resulting in [10, 20, 30, 40, 50].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-31T07:51:01.715Z  

```java
/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        if(root == null) 
          return ans;
        
        Queue<Node>q =new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp =q.poll();
            ans.add(temp.data);
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null)q.offer(temp.right);
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/level-order-traversal/1)