class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");             // 문자 단위로 분리하여 배열에 담아줌
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);                 // 문자도 반복 가능
        }
        return answer;
    }
}