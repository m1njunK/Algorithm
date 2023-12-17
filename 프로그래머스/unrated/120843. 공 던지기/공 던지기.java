class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int x = 0;
        x = (k-1) * 2;
        
        int y = 0;
        y = x%numbers.length;
        
        if(x > numbers.length){
            answer = numbers[y];
        }
        
        else answer = numbers[x];
        
        return answer;
    }
}