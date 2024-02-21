class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int x = a;
        int arr[] = new int[included.length];
        
        
        for(int i = 0; i < included.length; i++){
            arr[i] = x;
            x += d;
        }
        
        for(int i = 0 ; i < included.length; i++){
            if(included[i]){
                answer += arr[i];
            }
        }
        return answer;
    }
}