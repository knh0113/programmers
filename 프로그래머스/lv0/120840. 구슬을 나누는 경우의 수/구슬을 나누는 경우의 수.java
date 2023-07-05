// class Solution {
//     public int solution(int balls, int share) {
//         int answer = 0;
//         int b = 1;
//         int c = 1;
//         int d = 1;
        
//         if (share < balls){
//         for(int i = 1; i <= balls; i++) {
//             b *= i;
//         }
        
//          for (int j = 1; j <= balls-share; j++) {
//              c *= j;
//          }
        
//         for (int l = 1; l <= share; l++) {
//             d *= l;
//         }
//         answer = b/(c*d);
//         } else {
//             answer = 1;
//         }
//         return answer;
//     }
// }

class Solution {

    private int answer, balls, share;

    public int solution(int balls, int share) {
        answer = 0;
        this.balls = balls;
        this.share = share;

        for (int i = 0; i < balls; i++) {
            combination(i, 1);
        }

        return answer;
    }

    private void combination(int curIdx, int curCount) {
        if (curCount == share) {
            answer++;
            return;
        }

        for (int i = curIdx + 1; i < balls; i++) {
            combination(i, curCount + 1);
        }
    }
}