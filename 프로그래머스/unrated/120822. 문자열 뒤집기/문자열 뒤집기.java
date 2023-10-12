class Solution {
    public String solution(String my_string) {
        String answer = "";
        int count = my_string.length()-1;
        char[] array = new char[my_string.length()];
        
        for (int i=0;i<array.length;i++){
            array[i] = my_string.charAt(count);
            count -= 1;
            answer += array[i];
        }
        return answer;
    }
}