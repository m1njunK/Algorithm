import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        
        for(int i = 0; i < queries.length; i++){    
            
            int arr2[] = new int[queries[i][1]-queries[i][0]+1];
            int index = 0;
            
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                arr2[index] = arr[j];
                index++;
            }
            
            Arrays.sort(arr2);
            
            for(int x : arr2){
                if(x > queries[i][2]){
                    answer[i] = x;
                    break;
                }else{
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}