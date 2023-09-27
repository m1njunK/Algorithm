class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num1 = denom2 * numer1;
        int num2 = denom1 * numer2;
        int numer = num1+num2;
        int denum = denom1 * denom2;
    
        for(int i=numer;i>0;i--){
            if(numer % i == 0){
                if(denum % i == 0){
                    numer = numer / i;
                    denum = denum / i;
                }
            }
        }
       
        answer[0] = numer;
        answer[1] = denum;
        
        return answer;
    }
}