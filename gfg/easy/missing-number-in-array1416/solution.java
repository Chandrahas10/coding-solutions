class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        
      if(arr[0]==1 && arr.length==1)return 2;
      if(arr[0]==2 && arr.length==1)return 1;
      int i=1;
      while(i<=arr.length){
          if(i!=arr[i-1])
            return i;
          
        
        i++;
      }
      return arr.length+1;
    }
}