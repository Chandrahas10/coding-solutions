class Solution {
    void pushZerosToEnd(int[] arr) {
        int start = 0;
        int end = 0;

        while (end < arr.length) {

            if (arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
            }

            end++;
        }
    }
}