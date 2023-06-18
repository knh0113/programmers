class Solution {
    public int solution(int n, int t) {
        double answer =0;
        double a = (double)n;
        double b = (double)t;
        answer = Math.pow(2,b) * a;
        
        return (int)answer;
    }
}