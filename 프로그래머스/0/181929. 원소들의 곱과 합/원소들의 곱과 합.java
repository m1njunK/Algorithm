class Solution {
    public int solution(int[] num_list) {
        int result1 = 1;
        int result2 = 1;
        
        for(int i : num_list){
            result1 *= i;
            result2 += i;
        }
        
        if(result1 > (result2-1)*(result2-1)){
            return 0;
        }
        
        return 1;
    }
}