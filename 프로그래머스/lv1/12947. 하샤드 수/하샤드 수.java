class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int a = 0;
        String str = String.valueOf(x);
        for(int i = 0; i < str.length(); i++) {
            a += Character.getNumericValue(str.charAt(i));
            // a += (int)str.charAt(i);
            System.out.println(a);
        }
            if (x % a == 0) {
                answer = true;
            } else {
                answer = false;
            }
        return answer;
    }
}