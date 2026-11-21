class Solution {
    public int findMiddleIndex(int[] nums) {
        int Tsum=0;
            for(int i=0;i<nums.length;i++){
                Tsum+=nums[i];
            }
            int lsum=0;
            for(int i=0;i<nums.length;i++){
                int rsum=Tsum-lsum-nums[i];
                 
            if(lsum==rsum){
                return i;}
                
                lsum+=nums[i];

            
        }
        return -1;
    }
}