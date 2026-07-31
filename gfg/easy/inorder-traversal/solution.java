/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer>ans =new ArrayList<>();
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        if(root==null)
            return null;
        
        inOrder(root.left);
        ans.add(root.data);
        inOrder(root.right);
    
    return ans;
    
    }
}