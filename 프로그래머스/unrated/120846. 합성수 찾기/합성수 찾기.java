class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for(int j = n;j > 0 ; j--){
            for(int i=1; i<=n; i++){
                if(j%i == 0){
                    cnt++;
                    if(cnt == 3){
                        answer += 1;
                        cnt = 0;
                        break;
                    }
                    if(i == j) {
                    	cnt = 0;
                    	
                    }
                    
                }
        }
            }
        
        return answer;
    }
}