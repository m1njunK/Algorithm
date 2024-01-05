class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
        	answer++;
            
        	if(answer % 3 == 0) {
        		i--;
                continue;
        	}
            if(answer % 10 == 3){
                i--;
                continue;
            }
            if(answer / 10 == 3){
                i--;
                continue;
            }
            if(answer / 10 % 10 == 3){
                i--;
                continue;
            }
        }
        
        return answer;
    }
}