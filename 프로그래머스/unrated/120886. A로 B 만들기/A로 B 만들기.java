import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char beforeArray[] = before.toCharArray();
        char afterArray[] = after.toCharArray();
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        for(int i = 0 ; i < beforeArray.length; i++){
            if (beforeArray[i] == afterArray[i])
            {answer = 1;
                continue;}
            
            else {answer = 0;
                break;}
        }

        return answer;
    }
}