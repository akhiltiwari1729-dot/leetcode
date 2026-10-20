class Solution {
    public int maxNumberOfBalloons(String text) {
 HashMap<Character,Integer> hm=new HashMap<>();
 for(char i:text.toCharArray()){
    hm.put(i,hm.getOrDefault(i,0)+1);
 }
 HashMap<Character,Integer> required=new HashMap<>();
 required.put('b',1);
 required.put('a',1);
 required.put('l',2);
 required.put('o',2);
 required.put('n',1);
  
  int count= Integer.MAX_VALUE;
  for(char ch :required.keySet()){
    if(!hm.containsKey(ch)){
        return 0;
    }
    else{
        int available=hm.get(ch);
        int need=required.get(ch);
        int possible=available/need;
        count = Math.min(count,possible);

    }
  }
  return count;
    }
}