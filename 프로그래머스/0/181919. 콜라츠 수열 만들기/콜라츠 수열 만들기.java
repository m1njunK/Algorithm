class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        answer = new int[1000];
        answer[0] = n;
        
        int cnt = 1;
    
        for(int i = 0 ; i < 1000 ; i++){
            
            if(answer[cnt-1] % 2 == 0){
                answer[cnt] = answer[cnt-1] / 2;
                cnt++;
            }

            else{
                answer[cnt] = answer[cnt-1] * 3 + 1;
                cnt++;
            }

            if(answer[cnt-1] == 1){
                break;
            }
        } // end for
          
        int cnt2 = 0;
        for(int i : answer){
            if(i == 0){
                break;
            }
            cnt2++;
        }
        
        int[] answer2 = new int[cnt2];
        
        for(int i = 0 ; i < answer2.length ; i++){
            answer2[i] = answer[i];
        }
        
        return answer2;
    }
}