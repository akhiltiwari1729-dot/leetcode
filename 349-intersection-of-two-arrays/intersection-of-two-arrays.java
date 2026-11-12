class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>ls=new ArrayList<>();
        
        int n1= nums1.length;
        int n2= nums2.length;
        for(int i=0;i<n1;i++){
         for(int j=0;j<n2;j++){
           if(nums1[i]==nums2[j]){
            if(!ls.contains(nums1[i])){
            ls.add(nums1[i]);
            }
            break;
           }
         }
        }
        int [] ans = new int [ls.size()];
        for(int k=0;k<ls.size();k++){
            ans[k]=ls.get(k);
            
        }
        return ans;
        
    }
}