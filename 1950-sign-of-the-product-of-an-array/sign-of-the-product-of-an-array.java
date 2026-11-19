class Solution {

    int signFunc(int n){
    if(n==0){
        return 1;
        }
    else if(n%2==0){
    return 1;
        }
    else{
     return -1;
        }
     }
    public int arraySign(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            return 0;
        }
        if(nums[i]<0){
            count++;
        }
    }
    
   return  signFunc(count);
    }
}