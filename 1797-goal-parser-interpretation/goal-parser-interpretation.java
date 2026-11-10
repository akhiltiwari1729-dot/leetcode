class Solution {
    public String interpret(String command) {
        String com= command.replace("()","o");
        com= com.replace("(al)","al");
        return com;

    }
}