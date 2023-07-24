class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2); // 먼저 10진수로 바꿔주고
        int num2 = Integer.parseInt(bin2, 2);
        int number = num1 + num2;
        answer = Integer.toBinaryString(number); //다시 2진수로 바꿈
        return answer;
    }
}