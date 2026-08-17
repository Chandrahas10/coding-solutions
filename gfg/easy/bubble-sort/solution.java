class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int swap =arr[j];
                    arr[j] =arr[i];
                    arr[i]=swap;
                }
            }
        }
    }
}