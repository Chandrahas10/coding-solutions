class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0) {
            return ans;
        }

        int start = 0;
        int end = 1;

        ans.add(arr[start]);

        while (end < arr.length) {

            if (arr[start] != arr[end]) {
                start = end;
                ans.add(arr[start]);
            }

            end++;
        }

        return ans;
    }
}