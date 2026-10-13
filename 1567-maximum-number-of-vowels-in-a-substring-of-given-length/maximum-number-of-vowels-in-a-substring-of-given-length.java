class Solution {
    public boolean isv(char c){
        return c=='a' || c=='i' || c=='o' || c=='u' || c=='e';
    }
    public int maxVowels(String s, int k) {
        int mv=0;
        int c=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(isv(s.charAt(j))){
                c++;
            }
            if(j-i+1==k){
                mv=Math.max(mv,c);
                if(isv(s.charAt(i))){
                    c--;
                }
                i++;
            }
            j++;
        }
        return mv;
    }
}