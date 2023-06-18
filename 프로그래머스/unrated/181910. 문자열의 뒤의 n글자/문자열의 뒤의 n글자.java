// class Solution {
//     public String solution(String my_string, int n) {
        
//         int a = 0;
//         a = my_string.length() - n;
//         char [] answer = new char[n];
//         char [] str = my_string.toCharArray();
//         for (int i =a; i <my_string.length(); i++) {
//             answer[i-a] = str[i];
//             String result = new String(answer); 
//         }
//         return result;
//     }
// }

// substring : 문자열의 일부를 잘라내줌
class Solution {
    public String solution(String my_string, int n) {
        int a = my_string.length() - n;
        char[] answer = new char[n];
        char[] str = my_string.toCharArray();
        
        for (int i = a; i < my_string.length(); i++) {
            answer[i - a] = str[i];
        }
        
        String result = new String(answer);
        return result;
    }
}