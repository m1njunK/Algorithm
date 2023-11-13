import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int last = numbers.length-1;
        
        if((numbers[0]*numbers[1]) > numbers[last] * numbers[last-1])
            answer = numbers[0]*numbers[1];
        
        else
        answer = numbers[last] * numbers[last-1];
        
        return answer;

    }
}