import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = -1;
        for(int i = 0; i < arr.length; i++) {
                if(a != arr[i]) {
                    a = arr[i];
                    list.add(arr[i]);
                }
            }
        return list;
    }
}