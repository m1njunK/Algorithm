class Solution {
    public String[] solution(String[] quiz) {
        
        String[] array = new String[quiz.length*3];
		
		
		for(int i = 0; i < quiz.length ; i++) {
			quiz[i] = quiz[i].replace(" - ", " -");
			quiz[i] = quiz[i].replace(" + ", "z");
			quiz[i] = quiz[i].replace(" = ", " =");
			quiz[i] = quiz[i].replace("--", "z");
			quiz[i] = quiz[i].replace(" z", "z");
		}

		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = "";
		}
		
		int count = 0 ;
		
		
		
		for(int j = 0 ; j < quiz.length; j++) {
			for(int i = 0 ; i < quiz[j].length(); i++) {
				
				if(quiz[j].charAt(i) != ' ' && quiz[j].charAt(i) != '=' && quiz[j].charAt(i) != 'z') {
					array[count] += quiz[j].charAt(i);
					if(i == quiz[j].length()-1) {
						count++;
					}
				}
				
				else if (quiz[j].charAt(i) != '=' || quiz[j].charAt(i) == 'z'){
					count++;
				}
				
			}
		}
		
		String answer[] = new String[quiz.length];
		
		for(int j = 0 ; j < answer.length ; j++) {
			for(int i = j*3; i <= array.length-3 ; ) {
				if(Integer.parseInt(array[i]) + Integer.parseInt(array[i+1]) == Integer.parseInt(array[i+2])) {
					answer[j] = "O"; break;
					
				}else answer[j] = "X"; break;
			}
		}
        
        return answer;
    }
}