class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // char [] arr1 = str1.toCharArray();
        // char [] arr2 = str2.toCharArray();
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         if (arr1[i] == arr2[j]) {
        //             answer = 1;
        //         }
        //     }
        // }
        if (str2.contains(str1)) {          // contains : 두문자열을 비교하여 str2가 str1을 포함하는지
            return 1;
        }
        return answer;
    }
}