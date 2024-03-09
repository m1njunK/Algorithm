class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        int j = 0;
        
        for(int i = 0 ; i < queries.length; i++){
                int temp = arr[queries[i][j]];
                arr[queries[i][j]] = arr[queries[i][j+1]];
                arr[queries[i][j+1]] = temp;
        }
        
        return arr;
    }
}