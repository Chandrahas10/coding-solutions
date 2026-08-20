class Solution {
    public int findMaximum(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i])
                return arr[i];
        }
        return -1;
    }
}