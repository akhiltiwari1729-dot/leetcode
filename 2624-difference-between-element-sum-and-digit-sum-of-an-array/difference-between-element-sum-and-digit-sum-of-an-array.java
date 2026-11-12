class Solution {
    public int differenceOfSum(int[] nums) {
       int eSum=0;
       int digitSum=0;
        for(int i=0; i<nums.length;i++){
            eSum+=nums[i];
            }
            for(int j=0;j<nums.length;j++){
              int  num=nums[j];
                 while(num!=0){
                int d=num%10;
                digitSum+=d;
                num=num/10;
            }

        }
        return Math.abs(eSum - digitSum);
        
    }
}