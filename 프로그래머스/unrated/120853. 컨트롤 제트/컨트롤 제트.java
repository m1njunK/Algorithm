class Solution {
    public int solution(String s) {
        String[] array = new String [s.length()];
        
        int cnt = 0;
        
        
        s= s.replace(" Z","Z");
        
        for(int i = 0 ; i < array.length; i++) {
        	array[i] = "";
        }
        
        for(int i = 0 ; i < s.length() ; i ++) {   	
        	if(s.charAt(i) != ' ') {
        		array[cnt] += s.charAt(i);     		
        	}
        	else cnt++;
        }

        for(int i = 0 ; i < array.length; i++) {
        	
        	if(array[i].indexOf("Z") != -1) {
        		array[i] = "0";
        	}
        	
        }
        int answer = 0;
        
        for(int i = 0 ; i < array.length; i++) {
        	if(array[i] != "") {
        	answer += Integer.parseInt(array[i]);
        	System.out.println(answer);
        	}
        }
        
        return answer;
    }
}