class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i=0; i<array.length-1; i++){
            for (int j=i; j<array.length; j++){
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        int find_idx = array.length / 2 ;
        return array[find_idx];
    }
}


// 다른 사람 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2 ];
    }
}