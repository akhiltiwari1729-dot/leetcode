class Solution {
    public boolean isHappy(int n) {
     HashSet<Integer>hs =new HashSet<>();
     int num=n;
     while(num!=1){
        if(hs.contains(num)){
            return false;
        }
        hs.add(num);
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=d*d;
            num=num/10;
        }
        num=sum;
     }
     return true;
    }
}