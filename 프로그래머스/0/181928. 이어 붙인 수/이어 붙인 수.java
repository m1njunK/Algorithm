class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String x = "";
        String y = "";
        
        for(int i : num_list){
            if(i % 2 == 0){
                y += String.valueOf(i);
            }
            
            else{
                x += String.valueOf(i);
            }
        }
        
        answer = Integer.parseInt(x) + Integer.parseInt(y);
        
        return answer;
    }
}