import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[] x = new int[n];
        int count = 0;
    
	    for(int i = 2; i <= n; i++){  
	        		if(n % i == 0) {
	        			n = n / i;
	        			x[count] = i;
	        			count++;
	        			i = 1;
	      	}
	    }
	    
	    for(int i = 0; i < x.length; i++) {
	    	for(int j = i+1; j < x.length; j++) {
	    		if(x[i] != 0) {
	    		if(x[i] == x[j]) {
	    			x[j] = -1;
	    		}
	    		}
	    	}
	    }
	        
	    int cnt = 0;
	    
        for(int i = 0; i < x.length; i++){
        	if(x[i] == -1) {
        		continue;
        	}
        	
        	else if (x[i] == 0) {
        		break;
        	}
        	
        	else cnt++;
        }
        
        answer = new int [cnt];
        
        int cnt2 = 0 ;
        

        for(int i = 0; i < x.length; i++){
        	
        	if(x[i] == 0) {
        		break;
        	}
        	
        	if(x[i] != -1) {
        		answer[cnt2] = x[i];
        		cnt2++;
        	}
        	
        }
        
        return answer;
    }
}