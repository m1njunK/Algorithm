import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> list = Arrays.asList(morse);
        String[] letterArr = letter.split(" ");
        for(int i=0; i<letterArr.length; i++){
            int x = list.indexOf(letterArr[i]);
            answer += (char) ('a'+x);
        }
        
        return answer;
    }
}