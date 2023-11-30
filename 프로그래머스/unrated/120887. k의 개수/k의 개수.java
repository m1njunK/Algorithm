class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String array[] = new String [j-i+1];
        int cnt = 0;
        
        for(int x = i; x <= j; x++){
            array[cnt] = String.valueOf(x);
            cnt++;
        }
        
        String z = String.valueOf(k);
        
        for(int x = 0; x < array.length; x++){
        	for(int y = 0; y < array[x].length(); y++) {
        		if(array[x].charAt(y) == z.charAt(0)) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
}