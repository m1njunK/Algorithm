class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int x = 0;
        
        for(int i = b; i > 0; i--){
            if(a % i == 0 && b % i == 0){
                x = i;
                break;
            }
        }
        
        b /= x;
        
        if(1000000000 % b == 0){
            answer = 1;
        }
                
        return answer;
    }
}