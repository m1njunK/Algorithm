import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char array[] = new char[s.length()];
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = s.charAt(i);
        }
        
        Arrays.sort(array);
        
        for(int i = 0 ; i < array.length ; i++) {
        	answer += array[i];
        }
        
        for(int i = 0 ; i < answer.length(); i++) {
        	for(int j = i+1 ; j < answer.length(); j++) {
        		if(answer.charAt(i) == answer.charAt(j)) {
        			answer = answer.replace(answer.charAt(i), '0');
        		}
        	}
        }
        
       String answer2 = "";
       for(int i = 0 ; i < answer.length(); i++) {
    	   if(answer.charAt(i) != '0') {
    		   answer2 += answer.charAt(i);
    	   }
       }
        
        return answer2;
    }
}