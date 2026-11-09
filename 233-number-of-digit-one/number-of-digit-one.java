class Solution {
    public int countDigitOne(int n) {
        int count=0;
      for(int i=1;i<=n;i*=10){
        int div=i*10;
        int q=n/div;
        int rem=n%div;
        count+=q*i;
        if(rem>=i){
        count+=Math.min(rem-i+1,i);
        }
       
      }
      return count;
    }
}