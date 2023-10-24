class Solution {
    public int[] solution(int[] num_list) {
        int answer[] = new int[2];
        
        for(int x : num_list){
            boolean check = x % 2 == 0;
            if(check){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        
        return answer;
    }
}