import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        int b = 0;
        s = s.toLowerCase();
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("p")) {
                a++;
            } else if(str[i].equals("y")){
                b++;
            }
        }
        if (a == b) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}