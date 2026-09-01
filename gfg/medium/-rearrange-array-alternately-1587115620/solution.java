import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        int n = arr.length;

       
        Arrays.sort(arr);

        int minIdx = 0;
        int maxIdx = n - 1;

        // Encoding base
        int maxElem = arr[n - 1] + 1;

        // Rearrange: max, min, second max, second min...
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Extract new values
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElem;
        }
    }
}