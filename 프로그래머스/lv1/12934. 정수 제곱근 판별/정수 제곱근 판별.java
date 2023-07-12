class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = 0;
        long b = 0;
        for(long i = 1; i <= n; i++) {
            a = n % i;
            b = n / i;
            if (a == 0 && b ==i) {
                answer = (i + 1)*(i + 1);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}