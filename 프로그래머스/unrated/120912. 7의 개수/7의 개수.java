class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = "";
        for(int i = 0 ; i < array.length ; i++){
            a += String.valueOf(array[i]);
        }
        
        int cnt = 0;
        
        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) == '7'){
                cnt++;
            }
        }

        return cnt;
    }
}