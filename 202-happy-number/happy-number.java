class Solution {
    public boolean isHappy(int n) {
        int num=n;
        int sum=0;
        while(num!=1&&num!=4){
             sum=0;
            while(num!=0){
            int d=num%10;
            sum+=d*d;
            num=num/10;
        }
        num=sum;
        }
          if(num==1){
            return true;
          }
          return false;
    }
}