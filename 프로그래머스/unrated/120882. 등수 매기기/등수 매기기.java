class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        answer = new int[score.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answer.length;
        }
        
        for(int i = 0; i < score.length; i++){
            for(int j = i+1; j < score.length; j++){
                if(score[i][0] + score[i][1] > score[j][0] + score[j][1]){
                    answer[i] -= 1;
                }
                
                else if(score[i][0] + score[i][1] == score[j][0] + score[j][1]){
                    answer[i] -= 1;
                    answer[j] -= 1;
                }
                
                else{answer[j] -= 1;}
            }
        }
        
        return answer;
    }
}