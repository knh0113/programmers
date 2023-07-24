// class Solution {
//     public int solution(int left, int right) {
//         int answer = 0;
//         if (left == 1 && right == 2) {
//             answer = 1;
//         }
//         if (left == right) {
//             answer = (-2) * left;
//         } else if {
//         for(int i = left; i <= right; i++) {
//             answer += i; 
//             for(int j = 1; j < i; j++) {
//                 if( i / j == j && i % j ==0) {
//                     answer -= 2*i;
//                 } 
//             }
//         }
//             }
//         return answer;
//     }
// }

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++) {
            int cnt = 1;
            
            for(int j=1; j<=i/2; j++) {
                if(i % j == 0) cnt++;
            }
            
            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}