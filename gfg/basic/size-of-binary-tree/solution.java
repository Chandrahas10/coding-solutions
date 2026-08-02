/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int getSize(Node root) {
        return inOrder(root,0);
    }
    
    public int inOrder(Node root,int cnt){
        if(root == null)
            return cnt;
        
       cnt= inOrder(root.left,cnt);
        cnt++;
       cnt= inOrder(root.right,cnt);
        
        return cnt;
    }
}