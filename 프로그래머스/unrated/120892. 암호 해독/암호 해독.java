class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int x = cipher.length() / code;
        
        for(int i = 1; i <= x; i++){
            answer += cipher.charAt((i*code)-1);
        }
        
        return answer;
    }
}