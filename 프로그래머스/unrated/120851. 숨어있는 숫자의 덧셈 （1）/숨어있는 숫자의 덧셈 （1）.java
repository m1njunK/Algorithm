class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        int array[] = new int[10];
        
        String result = "";
        
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
        // 1==49
        
        for(int i = 0; i < my_string.length(); i++){
            
            for(int j = 0 ; j < array.length; j++){
                
                if((int) (my_string.charAt(i)-48) == array[j]){
                    
                    answer += array[j];
                    
                }
                
            }
        }
        
        return answer;
    }
}