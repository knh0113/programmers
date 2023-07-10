import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
    //     int index = 0;
    //       for (int i =0; i < todo_list.length; i++) {
    //         if (finished[i] == false) {
    //             index++;
    //         }
    //     }
    //     String[] answer = new String[index];
    // for (int i =0; i < todo_list.length; i++) {
    //         if (finished[i] == false) {
    //             answer.add(todo_list[i]);
    //         }
    //     }
    //     return answer;
    // }
         List<String> answerList = new ArrayList<>();
        
        for(int i =0; i < finished.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }
        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer); 
        return answer;
    }
}