class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];//시전시간
        int x = bandage[1];//초당 회복량
        int y = bandage[2];//추가 회복량
        int hp = health;//현재체력
        int time = attacks[attacks.length-1][0]; //총 시간
        int idx = 0;
        int cnt = 0; //연속 성공 횟수
        
        for(int i = 1; i <= time; i++) {
        	int at = attacks[idx][0]; //공격시간
        	int dmg = attacks[idx][1]; //피해량
            if(i == at){ //현재시간 == 공격시간
                hp -= dmg; //체력 감소
                cnt = 0; //연속 성공 횟수 초기화
                idx++;
            } else {
                cnt++;
                if(cnt == t){
                    hp += y+x;
                    cnt = 0;
                } else {
                    hp+=x;   
                }
            }
        	hp = hp > health ? health : hp;
            if(hp <= 0) {
        		return -1;
        	}
        }
        return hp;
    }
}