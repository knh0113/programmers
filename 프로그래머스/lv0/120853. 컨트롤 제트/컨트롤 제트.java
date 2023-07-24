// class Solution {
//     public int solution(String s) {
//         int sum = 0;
//         String[] arr = s.split(" ");
//         for(int i = 0; i < arr.length; i++) {
//             if (!arr[i].equals("z")) {
//                 sum += Integer.parseInt(arr[i]);
//             } else {
//                 int a = Integer.parseInt(arr[i-1]); 
//                 sum -= a;
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("Z")) {
                sum += Integer.parseInt(arr[i]);
            } else {
                int prevValue = Integer.parseInt(arr[i - 1]);
                sum -= prevValue;
            }
        }
        return sum;
    }
}