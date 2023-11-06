class Solution {
    public int solution(int hp) {
        int ents = 0;
        
        if(hp % 5 == 0){
            ents = hp/5;
        }
        
        else if (hp % 5 == 3){
            ents = (hp/5) + 1;
        }
        
        else if(hp % 5 > 3){
            ents = (hp/5) + 2;
        }
        
        else if(hp % 5 < 3){
            ents = (hp/5) + (hp%5);
        }
        
        return ents;
    }
}