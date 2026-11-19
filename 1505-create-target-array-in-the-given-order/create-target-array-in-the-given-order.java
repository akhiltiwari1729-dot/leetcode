class Solution {
    public int[] createTargetArray(int[] nums, int[] index) { 
        int [] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){ 
            int pos=index[i];
            for(int j=i;j>pos;j--){
                ans[j]=ans[j-1];
            }
            ans[pos]=nums[i];
        }
        return ans;
    }
}