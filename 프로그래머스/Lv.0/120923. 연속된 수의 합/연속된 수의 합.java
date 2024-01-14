class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        
        if(num % 2 == 1){
            int x = total / num;
            for(int i = num/2; i >= 0; i--){
                answer[i] = x;
                x--;
            }
            
            int y = total / num + 1;
            for(int i = num/2+1; i < num; i++){
                answer[i] = y;
                y++;
            }
        }else{
            int x = total / num;
            for(int i = num/2-1; i >= 0; i--){
                answer[i] = x;
                x--;
            }
            
            int y = total / num + 1;
            for(int i = num/2; i < num; i++){
                answer[i] = y;
                y++;
            }
        }
        
        return answer;
    }
}