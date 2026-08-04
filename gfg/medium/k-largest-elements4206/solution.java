class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
       
       PriorityQueue<Integer> max = new PriorityQueue<>();
       
       for(int i=0;i<k;i++){
           max.offer(arr[i]);
       }
       
       for(int i=k;i<arr.length;i++){
           
           if(arr[i]>max.peek()){
                    max.poll();
                    max.offer(arr[i]);
           }
           
       }
    ArrayList<Integer> ans = new ArrayList<>(max);
    ans.sort(Collections.reverseOrder());
    return ans;
    }
}
