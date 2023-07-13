class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] ab = new int[signs.length];
        for(int i = 0; i < signs.length; i++) {
            if (signs[i] == true) {
                ab[i] = absolutes[i];
            } else {
                ab[i] = (-1) * absolutes[i]; 
            }
        }
        for(int i = 0; i < signs.length; i++) {
            answer += ab[i];
        }
        return answer;
    }
}