import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if((int)c >= 48 && (int)c <= 57)        // 아스키코드 이용
                answer += c-'0';
        }
        return answer;
    }
}