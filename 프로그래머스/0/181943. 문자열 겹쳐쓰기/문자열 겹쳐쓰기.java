class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] array = new char[my_string.length()];
        
        for(int i = 0; i < array.length ; i++){
            array[i] = my_string.charAt(i);
        }
        
        int cnt = 0 ;
        for(int i = s; i < s+overwrite_string.length(); i++){
            array[i] = overwrite_string.charAt(cnt);
            cnt++;
        }
        
        for(int i = 0 ; i < array.length ; i++){
            answer += array[i];
        }
        
        return answer;
    }
}