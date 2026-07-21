class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean isprime =false;
        for(int i=2;i<n;i++){
            if(n%i ==0)
              return isprime=false;
            else
                isprime=true;
        }
        
        return isprime;
    }
}