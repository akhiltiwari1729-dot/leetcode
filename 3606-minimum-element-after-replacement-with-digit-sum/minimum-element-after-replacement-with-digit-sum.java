class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int dsum=0;
    if(n>0){
        
        while(n!=0){
            int d=n%10;
            dsum+=d;
            n=n/10;
        }
        }

        nums[i]=dsum;
        }
        int min=nums[0];
        for(int j=0;j<nums.length;j++){
          if(min>nums[j]){
            min=nums[j];
          }
        }
        return min;



    }
}