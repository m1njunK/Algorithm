class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        if(h > 0){
            if(board[h-1][w].equals(color)) answer++;
        }
        if(h < board.length-1){
            if(board[h+1][w].equals(color)) answer++;
        }
        if(w > 0){
            if(board[h][w-1].equals(color)) answer++;
        }
        if(w < board.length-1){
            if(board[h][w+1].equals(color)) answer++;
        }
        
        return answer;
    }
}