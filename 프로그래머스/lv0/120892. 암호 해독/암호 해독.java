class Solution {
    public String solution(String cipher, int code) {
        String [] answer = new String[cipher.length()/code];
        String sstr = "";
        String [] str = cipher.split("");
        for (int i = code-1; i < cipher.length(); i+=code) {
        sstr += str[i];
            }
        return sstr;
    }
}