class Solution {
    public int maxVowels(String s, int k) {
        int cnt=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cnt++;
            }
        }

        int start=0;
         int temp=cnt;
        for(int i=k;i<s.length();i++){
           
            if(s.charAt(start)=='a' ||s.charAt(start)=='e' ||s.charAt(start)=='i' ||s.charAt(start)=='o' ||s.charAt(start)=='u'){
                temp--;
                start++;
            }
            else{  start++;}


            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                temp++;
            }

          if(temp>cnt) cnt=temp;
          
        }

        return cnt;
    }
}