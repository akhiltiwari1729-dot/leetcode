class Solution {
    public boolean checkString(String s) {
        int flag=1;
        char []arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
         if(arr[i]=='b'&& arr[i+1]=='a'){
            flag =0;
         }


        }
        return flag==1;
    }
}