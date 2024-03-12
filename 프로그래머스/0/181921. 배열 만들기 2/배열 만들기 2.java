import java.util.*;

class Solution {
    public List solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        List<String> list = new ArrayList<>();
		
		for(int i = l/5; i <= r/5; i++) {
			if(String.valueOf(i).matches("^[^2-9]*$")){
				list.add(String.valueOf(i));
			}
		}
        
        for(int i = 0; i < list.size(); i++){
            answer.add(Integer.parseInt(list.get(i))*5);
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        return answer;
    }
}