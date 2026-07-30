class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer,Integer> map =new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            int val =map.get(arr[i]);
            if(val==1)
                return arr[i];
        }
        
        return 0;
    }
}
