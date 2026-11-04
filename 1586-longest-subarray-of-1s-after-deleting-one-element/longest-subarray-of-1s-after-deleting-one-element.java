class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int i = 0;
        
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                zeroCount += 1;
            }
            
            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            
            longestWindow = Math.max(longestWindow, k - i);
        }
        
        return longestWindow; // This belongs inside the method!
    }
}