import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        String[] str = my_string.split("");
        ArrayList<String> list = new ArrayList<>();
        for(int i = c - 1; i < str.length; i += m) {
            list.add(str[i]);
        }
        for (String s : list) {
            answer.append(s);
        }
        return answer.toString(); 
    }
}