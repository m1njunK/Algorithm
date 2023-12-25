class Solution {
    public int solution(int balls, int share) {
        
        double a = 1;
		double b = 1;
		double c = 1;
		double answer = 0;
        
        int answer2 = 0;
        
        
        for(int i = 1; i <= balls; i++) {
			a = a/10*i;
		}
		
		for(int i = 1; i <= share; i++) {
			b = b/10*i;
		}
		
		for(int i = 1; i <= (balls-share); i++) {
			c = c/10*i;
		}
			
		answer = a/(c*b);
        answer2 = (int) Math.round(answer);
        
        
        return answer2;
    }
}