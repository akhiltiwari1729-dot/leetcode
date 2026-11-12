class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] ans= new int[n1+n2];
        for(int i=0;i<n1;i++){
            ans[i]=nums1[i];
        }
        for(int j=0;j<n2;j++){
            ans[n1+j]=nums2[j];
        }
        Arrays.sort(ans);
      double a = 0;

        if(ans.length % 2 != 0) {
            a = ans[ans.length / 2];
        }
        else {
            a = (ans[ans.length / 2] + ans[(ans.length / 2) - 1]) / 2.0;
        }

        return a;
}
}