class Solution {
    public int kthElement(int a[], int b[], int k) {
      ArrayList<Integer> ans =new ArrayList<>();
      int i=0;
      int j=0;
      while(i<a.length && j<b.length){
          if(a[i]<=b[j]){
              ans.add(a[i]);
              i++;
          }
          else{
              ans.add(b[j++]);
          }
      }
      while(i<a.length){
          ans.add(a[i++]);
      }
      while(j<b.length){
          ans.add(b[j++]);
      }
      
      return ans.get(k-1);
        
    }
}