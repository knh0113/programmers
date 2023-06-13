class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int [] arr = new int[num_str.length()];
        for (int i = 0; i < num_str.length(); i++) {
        char c = num_str.charAt(i);
        arr[i] = Character.getNumericValue(c);
        answer += arr[i];
            }
        return answer;
    }
}