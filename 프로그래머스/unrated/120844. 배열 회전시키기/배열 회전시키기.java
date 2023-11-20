class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        
        switch(direction){
            case "right" : {
                
                int first = numbers[numbers.length-1];
                
                for(int i = answer.length-1 ; i > 0 ; i--){
                    answer[i] = numbers[i-1];
                }
                
                answer[0] = first;
                break;
            }
                
            case "left" : {
                int last = numbers[0];
                
                for(int i=0; i < answer.length-1; i++)
                {
                    answer[i] = numbers[i+1];
                }
                answer[numbers.length-1] = last;
            }
                break;
        }
        
        return answer;
    }
}