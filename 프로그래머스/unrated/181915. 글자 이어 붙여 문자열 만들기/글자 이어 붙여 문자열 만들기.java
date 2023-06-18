class Solution {
    public String solution(String my_string, int[] index_list) {
        String str = "";
        int a;
        char [] arr = new char [my_string.length()];
        arr = my_string.toCharArray();
        for (int i = 0; i < index_list.length; i++) {
            a = index_list[i];
            str += arr[a];
        }
        
        return str;
    }
}