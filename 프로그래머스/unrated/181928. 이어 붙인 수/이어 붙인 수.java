class Solution {
    public int solution(int[] num_list) {
        int a =0;
        int b = 0;
        String odd = "";
        String even = "";
        for (int i =0; i < num_list.length; i++) {
        if (num_list[i]%2 ==1) {
            odd += num_list[i];
            a = Integer.parseInt(odd);
        } else {
            even += num_list[i];
            b = Integer.parseInt(even);
        }
    }
        return a+b;
    }
}