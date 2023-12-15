class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        if(my_str.length() % n == 0){
            answer = new String[my_str.length()/n];
        }
        
        else{
            answer = new String[my_str.length()/n+1];
        }
        
        for(int i = 0 ;i < answer.length; i++) {
        	answer[i] = "";
        }
        
        int cnt = 0;
        
        if(n != 1){
            for(int i = 0 ; i < my_str.length() ; i++){
                  answer[cnt] += my_str.charAt(i);
                  if(i != 0 && i % n == n-1) {
                      cnt++;
                  }
            }
        }
        
        else{
            for(int i = 0 ; i < my_str.length(); i++){
                answer[i] += my_str.charAt(i);
            }
        }
        
        return answer;
    }
}