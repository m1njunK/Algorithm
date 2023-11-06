class Solution {
    public String solution(String my_string) {
        String arr[] = my_string.split("");
        String answer = "";
        for(String s : arr){
            if(s.matches("[a-z]")){
                answer += s.toUpperCase();
            }else{
                answer += s.toLowerCase();
            }
        }
        return answer;
    }
}