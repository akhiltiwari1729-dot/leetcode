class Solution {
    public int mostWordsFound(String[] sentences) {
        int Max=0;
     for(int i=0;i<sentences.length;i++){
        String []part=sentences[i].split(" ");
         Max=Math.max(part.length,Max);
 }   
             return Max;
    }
}