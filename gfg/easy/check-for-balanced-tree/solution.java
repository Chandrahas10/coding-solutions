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