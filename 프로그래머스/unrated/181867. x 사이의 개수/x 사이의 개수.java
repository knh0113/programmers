// import java.util.*;

// class Solution {
//     public List solution(String myString) {
//         int count = 0;
//         List <Integer> list = new ArrayList<>();
//         String[] str = myString.split("x");
//         for(int i = 0; i < str.length; i++) {
//             count = str[i].length();
//             list.add(count);
//         }
//         return list;
//     }
// }
// 이렇게 풀면 마지막이 해결안됨 ㅜ
class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x",-1);
        int[] answer =  new int[str.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();
        }
        return answer;
    }
}
