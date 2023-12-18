class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String array[] = new String [my_string.length()];
        int cnt = 0;
        int array2[] = new int [array.length];
        
        for(int i = 0 ; i < array.length; i++){
            array[i] = "";
            
            if(my_string.charAt(i) != ' '){
                if(my_string.charAt(i) == '+'){
                    array[cnt] = "0";
                }
                
                else if(my_string.charAt(i) == '-'){
                    array[cnt] = "0";
                    array[cnt+1] = "-";
                }
                
                else
                array[cnt] += my_string.charAt(i);
            }
            
            else cnt++;
        }
        
        for(int i = 0 ;  i < array2.length ; i++){
            if(array[i] != ""){
                array2[i] = Integer.parseInt(array[i]);
            }
        }
        
        for(int i : array2){
            answer += i;
        }
        
        return answer;
    }
}