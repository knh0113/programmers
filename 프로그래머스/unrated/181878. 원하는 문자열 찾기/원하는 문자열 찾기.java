import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String strr = pat.toLowerCase();
        if (str.contains(strr)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}