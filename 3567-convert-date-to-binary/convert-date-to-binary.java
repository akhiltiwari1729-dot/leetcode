class Solution {
    public String convertDateToBinary(String date) {
     String []arr=date.split("-");
     int year=Integer.parseInt(arr[0]);
     int month=Integer.parseInt(arr[1]);
     int day=Integer.parseInt(arr[2]);
      String y=Integer.toBinaryString(year);
      String m=Integer.toBinaryString(month);
      String d=Integer.toBinaryString(day);
      return y+"-"+m+"-"+d;
    }
}