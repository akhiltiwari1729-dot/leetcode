class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] ans=new int [nums.length];
        int[] leftSum = new int [nums.length];
        int[] rightSum = new int [nums.length];
        int sum1=0;
        int sum2=0;
         for(int i=0; i<nums.length;i++){
            leftSum[i]=sum1;
            sum1 +=  nums[i];
         }
         for(int j=nums.length-1;j>=0;j--){
            rightSum[j]=sum2;
            sum2 += nums[j];

         }
         for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(leftSum[k]-rightSum[k]);
         }
         return ans;
    }
}