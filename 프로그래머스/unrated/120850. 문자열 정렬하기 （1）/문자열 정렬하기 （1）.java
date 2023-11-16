import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
		for(int i=0; i<my_string.length(); i++) {
			String x = my_string.charAt(i)+"";
			boolean chk = x.matches("[0-9]");
			if(chk) {
				answer.add(Integer.parseInt(x));
			}
		}
        Collections.sort(answer);
        return answer;
    }
}