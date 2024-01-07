class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        String x = "";

        for(int i = 0; i < A.length(); i++){
            x += A.charAt(A.length()-1);
            for(int j = 0; j < A.length()-1; j++){
                x += A.charAt(j);
            }
            A = x;
            if(x.equals(B)){
                answer = i+1;
                break;
            }
            x = "";
        }
        
        if(answer == A.length()){
            answer = 0;
        }
        
        return answer;
    }
}