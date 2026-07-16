class Solution {
    public int minJumps(int[] arr) {

        if (arr.length == 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int far = 0;
        int cend = 0;
        int jump = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            far = Math.max(far, i + arr[i]);

            if (i == cend) {

                if (far == cend)
                    return -1;

                jump++;
                cend = far;

                if (cend >= arr.length - 1)
                    return jump;
            }
        }

        return -1;
    }
}