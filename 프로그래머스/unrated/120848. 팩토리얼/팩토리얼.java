class Solution {
    public long solution(int n) {
        long answer = 0;
        long result = 1;
        
        for(long i = 1; i <= 10; i++){
            result = result * i;
            
            if (result == n){
                answer = i;
                
                break;
            }
            
                else if(result>n){
                answer = i-1;
                break;
            }
        }
             return answer;
        }
       
        
    }
