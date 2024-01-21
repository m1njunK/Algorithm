import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int arr[] = new int [4];
        
        for(int i = 0; i < 4; i++){
            arr[i] = dots[i][0] - dots[i][1];
        }
        
        
        
        Arrays.sort(arr);
        
        if(arr[0]+arr[3] == arr[1]+arr[2]){
            answer = 1;
        }
        
        return answer;
    }
}