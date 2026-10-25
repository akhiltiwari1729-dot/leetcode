class Solution {
    public int countPairs(List<Integer> nums, int target) {
        List<Integer>ans=new ArrayList<>();
    
        for(int i=0;i<nums.size();i++){
            for(int j=nums.size()-1;j>i;j--){
                if(nums.get(i)+nums.get(j)<target){
                    ans.add(i);
                    ans.add(j);
                    
                }
            }
        }
        int count=ans.size()/2;
        return count;
      
    }
}