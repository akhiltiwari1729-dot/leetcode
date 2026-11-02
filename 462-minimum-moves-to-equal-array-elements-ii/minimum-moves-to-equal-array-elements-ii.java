class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
      int mid=nums.length/2;
      int sumcount=0;
      
      for(int i=0; i<nums.length;i++){
        if(nums[mid]==nums[i]){
            sumcount+=0;
        }
        else{
            int d=Math.abs(nums[mid]-nums[i]);
            sumcount+=d;
        }
      }
      return sumcount;
    }
}