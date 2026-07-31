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