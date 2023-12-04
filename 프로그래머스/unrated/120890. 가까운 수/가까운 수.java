import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        int answer = 0;
        
        
        int array1[] = new int [array.length];
        int array2[] = new int [array.length];
        int array3[] = new int [array.length];
        
        for(int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }
        
        Arrays.sort(array1);
        
        for(int i = 0; i < array.length ; i++){
            
            if(array1[i] > n){
                array2[i] = array1[i] - n;
            }
            
            else
            array2[i] = n-array1[i];
            
        }
        
        for(int i = 0; i < array2.length; i++){
            array3[i] = array2[i];
        }
        
        Arrays.sort(array2);
        
        int indexNum = 0;
        
        for(int i = 0; i < array3.length; i++){
            if(array2[0] == array3[i]){
                indexNum = i;
                break;
            }
        }
        
        answer = array1[indexNum];
        
        return answer;
    }
}