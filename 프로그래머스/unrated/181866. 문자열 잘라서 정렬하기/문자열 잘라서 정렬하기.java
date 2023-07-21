import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String str = myString.replaceAll("x", "");
        String[] answer = str.split("");
        Arrays.sort(answer);
        return answer;
    }
}