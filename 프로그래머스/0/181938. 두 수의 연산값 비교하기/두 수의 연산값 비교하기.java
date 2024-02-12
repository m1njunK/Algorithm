class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String x = String.valueOf(a) + String.valueOf(b);
        int y = a*b*2;
        
        answer = Integer.parseInt(x) > y ? Integer.parseInt(x) : y ;
        
        
        return answer;
    }
}