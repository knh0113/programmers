class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        long left = 0;
        for(long i = 1; i <= count; i++) {
            total += i * price;
            left = money - total;
        }
        if(left > 0) {
            answer = 0;
        } else {
            answer = (-1) * left;
        }

        return answer;
    }
}