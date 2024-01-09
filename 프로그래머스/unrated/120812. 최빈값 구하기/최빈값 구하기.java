class Solution {
    public int solution(int[] array) {
		
		int answer = 0;
        int[] newArray = new int[1000];
        int maxNum = 0;
        
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    newArray[array[i]]++;
                }
            }
        }           
        
        
        for(int i=0;i<newArray.length;i++) {	
        	if(newArray[0] < newArray[i]) {
    			newArray[0] = newArray[i];
        		maxNum = i;
    		}
        }      
        
        for(int i=1;i<newArray.length;i++) {
        	if((maxNum) != i) {
                if(newArray[maxNum] == newArray[i]) {
        		    answer = -1;
        	    }
            } else {
        		answer = maxNum;
        	}
        }

        if(array.length == 1){
            answer = array[0];
        }
        
        return answer;
    }
}