class Solution {
    public int findKRotation(int arr[]) {
       
       int min=arr[0];
       int pos=0;
       for(int i=1;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
               pos=i;
           }
       }
       
       return pos;
        
    }
}