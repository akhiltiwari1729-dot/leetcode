class Solution {
    public int pivotIndex(int[] nums) {
       
    for(int k=0;k<nums.length;k++){
         int lsum=0;
        int rsum=0;
        
    for(int i=0;i<k;i++){
        lsum+=nums[i];
    }
        for(int j=k+1;j<nums.length;j++){
            rsum+=nums[j];
    }  
    if(lsum==rsum){
        return k;
    }
    }   
    return -1;  
    }
}