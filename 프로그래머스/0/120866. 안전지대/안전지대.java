class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        
		int[][] arr = new int[board.length+2][board.length+2];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                arr[i+1][j+1] = board[i][j];
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
            	if(board[i][j] == 1) {
            		int x = i+1;
            		int y = j+1;
                    arr[x][y-1] = 1;
                    arr[x][y+1] = 1;
                    arr[x-1][y-1] = 1;
                    arr[x-1][y] = 1;
                    arr[x-1][y+1] = 1;
                    arr[x+1][y-1] = 1;
                    arr[x+1][y] = 1;
                    arr[x+1][y+1] = 1;
            	}
            }
        }
        
        for(int i = 1; i <= board.length; i++) {
        	for(int j = 1; j <= board.length; j++) {
        		if(arr[i][j] == 1) {
        			answer--;
        		}
        	}
        }
        
        return answer;
    }
}