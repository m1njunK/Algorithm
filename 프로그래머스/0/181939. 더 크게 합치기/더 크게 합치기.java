class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        
        String num_1 = num1+num2;
        String num_2 = num2+num1;
        
        if(Integer.parseInt(num_1) > Integer.parseInt(num_2))
            answer = Integer.parseInt(num_1);
        
        else
            answer = Integer.parseInt(num_2);
        
        return answer;
    }
}