import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char [] a = after.toCharArray();
        char [] b = before.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        // String aa = new String(a);
        // String bb = new String(b);
        if (Arrays.equals(a,b)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}