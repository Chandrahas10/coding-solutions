import java.util.*;
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int bestend =arr[0];
        int res=bestend;
        for(int i=1;i<arr.length;i++){
            int prevbest =bestend;
            bestend=Math.max(prevbest+arr[i],arr[i]);
            res=Math.max(bestend,res);
        }
        return res;
    }
}
