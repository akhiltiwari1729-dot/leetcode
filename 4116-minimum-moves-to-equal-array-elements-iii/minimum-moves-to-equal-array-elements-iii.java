class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int end=nums.length-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          int d=nums[end]-nums[i];
          sum+=d;
        }
        return sum;
    }
}