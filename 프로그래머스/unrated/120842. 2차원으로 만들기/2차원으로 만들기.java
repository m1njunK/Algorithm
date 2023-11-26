class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        answer = new int[num_list.length/n][n];
        int x = 0;
        
        for(int j=0; j<num_list.length/n; j++){
            for(int i=0; i < n; i++){
                answer[j][i] = num_list[x];
                x++;
            }
        }
        return answer;
    }
}