class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] arr = {"aya","woo","ye","ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < arr.length; j++){
                babbling[i] = babbling[i].replace(arr[j],"0");
            }
        }
        
         for(int i = 0; i < babbling.length; i++) {
        	babbling[i] = babbling[i].replaceAll("0", "");
        }
        
        for(String x : babbling){
            if(x.equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}