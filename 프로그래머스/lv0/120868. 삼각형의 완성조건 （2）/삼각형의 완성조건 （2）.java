class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        
        int b = sides[1];
        for(int i =1; i <= 2000; i++) {
        if (a + b > i && a + i > b && b + i > a) {
            answer++;
        }
        }
        return answer;
    }
}