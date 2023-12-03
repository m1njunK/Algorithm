class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        		char a1 = 'a';
		char a2 = 'A';
		String[] array = new String[my_string.length()];
		
		for(int i = 0 ; i < 26; i++) { 
				my_string = my_string.replace(a1, ' ');
				my_string = my_string.replace(a2, ' ');
				a1++;					
				a2++;
		}
		int cnt = 0;
		
		for(int i = 0; i < my_string.length(); i++) {
			array[i] = "";
			if(my_string.charAt(i) == ' ') {
				cnt++;
			}
			
			else array[cnt] += my_string.charAt(i);
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] != "") {
				answer += Integer.parseInt(array[i]);
			}
		}
        
        return answer;
    }
}