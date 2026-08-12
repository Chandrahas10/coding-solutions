class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer>st =new Stack<>();
        ArrayList<Integer>result =new ArrayList<>();
        int n=arr.length-1;
        
        for(int i=n;i>=0;i--){
            
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            
            if(st.isEmpty())    
                result.add(-1);
            
            else
                result.add(st.peek());
            
            st.push(arr[i]);
        }
        
        Collections.reverse(result);
        return result;
        
    }
}