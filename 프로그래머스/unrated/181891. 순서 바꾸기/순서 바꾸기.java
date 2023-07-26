// class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length];
//         int count = 0;
//         int ccount = n-1;
//         for (int i = n; i < num_list.length; i++) {
//             answer[count++] = num_list[i];
//             //answer[0] = num_list[1];
//             //answer[1] = num_list[2];
//         }
//         for (int i = 0; i < n; i++) {
//             answer[ccount++] = num_list[i];
//             //answer[0] = num_list[0];
//         }
//         if (n == 1) {
//             for(int i = 0; i < num_list.length - 1; i++) {
//                 answer[i] = num_list[i+1];
//             }
//             answer[num_list.length - 1] = num_list[0];
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int count = 0;
        
        // 기존 코드에 있던 ccount 초기화 삭제

        for (int i = n; i < num_list.length; i++) {
            answer[count++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[count++] = num_list[i];
        }

        // n이 1인 경우 처리를 위한 조건문 삭제

        return answer;
    }
}