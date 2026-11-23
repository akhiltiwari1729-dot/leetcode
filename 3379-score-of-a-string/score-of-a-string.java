class Solution {
    public int scoreOfString(String s) {
        int n=0;
        for(int i=1;i<s.length();i++){
            n +=Math.abs(s.charAt(i-1)-s.charAt(i));
        }
        return n;
    }
}