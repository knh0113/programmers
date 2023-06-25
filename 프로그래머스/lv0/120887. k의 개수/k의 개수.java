import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int [] a = new int [j -i + 1];
        for (int l =0; l <= j -i; l++) {
            a[l] = i + l;
        }
        String b = Arrays.toString(a);
        for(int l = 0; l< b.length(); l++) {
            if (b.charAt(l) == Integer.toString(k).charAt(0)) {
                answer++;
            }
        }
        return answer;
    }
}