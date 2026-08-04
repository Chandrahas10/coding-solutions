class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        // code here
        PriorityQueue<Integer>sort =new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            sort.offer(arr[i]);
        }
        
        // we have to store the element in the arr 
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sort.poll();
        }
        
      
    }
}