class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr= s.split(" ");
        String[] brr=new String[k];
        for(int i=0;i<k;i++){
            brr[i]=arr[i];
        }
        String ans=String.join(" ",brr);
        return ans;
    }
}