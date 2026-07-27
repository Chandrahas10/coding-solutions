class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length+b.length;
        int [] m=new int[n];
        int s1=0;
        int s2=0;
        int idx=0;
    
         while (s1 < a.length && s2 < b.length) {
            if (a[s1] <= b[s2]) {
                m[idx++] = a[s1++];
            } else {
                m[idx++] = b[s2++];
            }
        }
        
         while (s1 < a.length) {
         m[idx++] = a[s1++];
        }

        while (s2 < b.length) {
        m[idx++] = b[s2++];
        }
        
        for(int i=0;i<a.length;i++){
            a[i]=m[i];
        }
        for(int i=a.length;i<n;i++){
            b[i-a.length]=m[i];
        }
    }
}
