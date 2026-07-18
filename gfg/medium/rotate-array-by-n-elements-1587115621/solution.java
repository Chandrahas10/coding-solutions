class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
         d = d % n;
        int [] nums =new int [arr.length];
         for(int i=0;i<arr.length;i++){
             nums[((i-d)+n)%n]=arr[i];
         }
       for(int i=0;i<arr.length;i++){
           arr[i]=nums[i];
       }
    }
}