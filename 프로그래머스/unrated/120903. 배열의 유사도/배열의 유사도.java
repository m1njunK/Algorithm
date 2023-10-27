class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int i,j;
        int count = 0;
        int next = 0;
        
        for(i=0;i<s1.length;i++){
            for(j=0;j<s2.length;j++){
                if (s1[i].equals(s2[j])){
                    count++;
                }
            }
        }
        return count;
    }
}