class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char [] arr = my_string.toCharArray();
        for (int i =0; i < n; i++) {
        answer += arr[i];       // 문자 배열 더해서 문자열 만들기 가능하다 
        }
        return answer;
    }
}