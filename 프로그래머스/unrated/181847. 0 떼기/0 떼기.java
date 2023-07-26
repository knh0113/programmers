class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] str = n_str.split("0"); 
        for (int i =0; i < str.length; i++ ) {
            if (str[0].contains('0')) {
                str = str.remove(str[0]);
                answer = String.valueOf(str);
                break;
            } else {
                answer = String.valueOf(str);
            }
        }
        return answer;
    }
}