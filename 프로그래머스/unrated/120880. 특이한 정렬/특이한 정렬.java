class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        int temp = 0;
        
        for(int i = 0; i < numlist.length; i++){
            for(int j = i+1; j < numlist.length; j++){
                if(numlist[i] < numlist[j]){
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        
        for(int i = 0; i < numlist.length; i++){
            for(int j = i+1; j < numlist.length; j++){
                if(Math.abs(n-numlist[i]) > Math.abs(n-numlist[j])){
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }   
            }
        }
        
        return numlist;
    }
}