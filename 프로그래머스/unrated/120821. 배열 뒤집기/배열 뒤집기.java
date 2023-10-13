class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        int count = 0;
        
        for(int i=num_list.length-1;i>=0;i--){
            answer[count] = num_list[i];
            count += 1;
        }
        
        return answer;
    }
}