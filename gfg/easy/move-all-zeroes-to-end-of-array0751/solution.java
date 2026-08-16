class Solution {
    void pushZerosToEnd(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans.add(arr[i]);
            }
        }

   
        while (ans.size() < arr.length) {
            ans.add(0);
        }

      
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
    }
}