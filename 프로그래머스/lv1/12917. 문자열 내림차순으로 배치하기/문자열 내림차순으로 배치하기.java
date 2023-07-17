import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        System.out.print(str);
        for(String a : str)
           answer += a;
        return answer;
    }
}