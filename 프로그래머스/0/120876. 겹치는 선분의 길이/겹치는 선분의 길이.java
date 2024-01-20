class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int arr[] = new int[201];
        int index = 0;
        int arr2[] = new int[201];
        
        for(int i = -100; i <= 100; i++){
            arr[index] = i;
            index++;
        }
        
        for(int j = 0; j < arr.length; j++){
            for(int k = 0; k < 3; k++){
                for(int i = lines[k][0]; i < lines[k][1]; i++){
                    if(arr[j] == i){
                        arr2[j] += 1;
                    }
                }
            }
        }
        
        for(int i = 0; i < arr2.length-1; i++){
            if(arr2[i] > 1){
                answer += 1;
            }
        }
        
        return answer;
    }
}