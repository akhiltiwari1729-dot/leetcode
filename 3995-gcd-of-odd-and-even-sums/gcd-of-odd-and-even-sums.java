class Solution {
    public int gcdOfOddEvenSums(int n) {
      int  countEven =0;
      int countOdd=0;
      int i=1;
      int sumOdd=0;
      int sumEven=0;
       while(countEven <n || countOdd <n){
         if(i%2==0){
          sumEven+=i;
          countEven+=1;

         }
         else{
            sumOdd+=i;
            countOdd+=1;
         }
         i++;
       }
       return GCD(sumOdd,sumEven);
    }
    public int GCD( int a, int b){
        while(b!=0){
        int temp =b;
        b=a%b;
        a=temp;
        
    }

     return a;
    }
}