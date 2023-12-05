class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        int[] array = new int[emergency.length];
        int count=0;
        for(int i=0; i<emergency.length; i++){
            array[i] = emergency.length;
            System.out.println(array[i]);
        }
        
        for(int i=0; i<emergency.length; i++){
            for(int j=i+1; j<emergency.length;j++){
                if(emergency[i] < emergency[j])
                {
                    array[j] -= 1;
                }
                else array[i] -= 1;
            }
        }
        
        return array;
    }
}