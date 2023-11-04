import java.util.*;
class Solution {
    public List solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int x : numlist){
            if(x%n==0){
                answer.add(x);
            }
        }
        return answer;
    }
}